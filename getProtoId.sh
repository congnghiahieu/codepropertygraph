#! /bin/env bash

grep -i -h -r -o -P -e "(?<=\.protoId\()\d+(?=\))" schema/src/main/scala/io/shiftleft/codepropertygraph/schema | sort --numeric-sort --unique >uniqueProtoIds.txt
