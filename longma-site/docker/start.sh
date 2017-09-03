#!/bin/bash

SECONDS=0
WAIT_TIMEOUT=180
BASE_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
source $BASE_DIR/container.sh

echo "启动ELK和Zipkin"
docker-compose up -d elasticsearch logstash kibana zipkin
wait_container_ok_by_log $WAIT_TIMEOUT "elasticsearch" "started"
wait_container_ok_by_log $WAIT_TIMEOUT "logstash" "started Logstash"
wait_container_ok_by_log $WAIT_TIMEOUT "zipkin" "Started ZipkinServer"

echo "启动后台服务"
docker-compose up -d
docker-compose scale chat-message-service=2
wait_container_ok_by_log $WAIT_TIMEOUT "service-register-center" "Started Application"
wait_container_ok_by_log $WAIT_TIMEOUT "gateway" "Started Application"
wait_container_ok_by_log $WAIT_TIMEOUT "auth-service" "Started Application"
wait_container_ok_by_log $WAIT_TIMEOUT "chat-message-service" "Started Application"

wait_container_ok_by_log $WAIT_TIMEOUT "kibana" "Server running at"

DURATION=$SECONDS
echo -e "\033[32m 启动完毕, 耗时$(($DURATION / 60))分$(($DURATION % 60))秒 \033[0m"