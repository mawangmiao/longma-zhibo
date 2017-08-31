#!/bin/bash

docker-compose -p longma up -d --build
echo "扩容..."
docker-compose -p longma scale chat-message-service=3
