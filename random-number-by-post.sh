#!/bin/sh

curl -H "Content-Type: application/json" --data-binary '{"max":99}' 'http://localhost:8081/api/random-number'
echo
