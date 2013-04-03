#!/bin/bash
echo $@
java -cp ../libs/jsoup-1.7.2.jar:./bin/ com.github.geakstr.parser.Main $@