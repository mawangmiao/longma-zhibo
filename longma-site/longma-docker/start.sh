#!/bin/bash

docker-compose up -d --build
echo "扩容..."
docker-compose scale chat-message-service=2
