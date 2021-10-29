#!/bin/bash

export TERM=${TERM:-dumb}
cd customer-app
./gradlew --no-daemon clean build