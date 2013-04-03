#!/bin/bash
rm -rf bin
mkdir bin
javac -cp ../libs/jsoup-1.7.2.jar:./ -sourcepath src/ -d bin src/com/github/geakstr/parser/Main.java