#! /bin/env bash

VERSION="999.0.0-SNAPSHOT"

# Publish local is publish to $HOME/.m2/repository
# Use --clean for the first time build only
if [ "$1" == "--clean" ]; then
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' clean publishM2
elif [ "$1" == "--test" ]; then
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' clean test publishM2
else
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' publishM2
fi
