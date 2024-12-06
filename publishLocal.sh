#! /bin/env bash

VERSION="999.0.0-SNAPSHOT"

# Publish local is publish to $HOME/.ivy2/local
# Use --clean for the first time build only
if [ "$1" == "--clean" ]; then
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' clean publishLocal
elif [ "$1" == "--test" ]; then
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' clean test publishLocal
else
  sbt 'set ThisBuild/version := "999.0.0-SNAPSHOT"' publishLocal
fi
