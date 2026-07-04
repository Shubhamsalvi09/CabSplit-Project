#!/bin/bash

echo "Pulling latest image..."
docker pull salvishubham50/cabsplit:latest

echo "Stopping old container..."
docker stop cabsplit-app || true

echo "Removing old container..."
docker rm cabsplit-app || true

echo "Starting new container..."
docker run -d \
  --name cabsplit-app \
  -p 8080:8080 \
  salvishubham50/cabsplit:latest

echo "Deployment completed!"
