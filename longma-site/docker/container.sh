#!/bin/bash

# 根据日志内容,判断并等待容器中应用启动
function wait_container_ok_by_log {
  STARTED=""
  COUNT=0
  while [[ -z "$STARTED" && COUNT -lt $1 ]]; do
    STARTED=$(docker-compose logs $2 2>&1 | grep "$3")
    echo "等待$2启动"
    sleep 1
    COUNT=$(($COUNT+1))
  done

  if [[ -z "$STARTED" ]]; then
    #启动失败
    echo "timeout waiting startup of $2"
    echo -e "\033[31m $2启动超时 \033[0m"
    exit 1
  fi

  echo -e "\033[32m $2启动完毕 \033[0m"
}