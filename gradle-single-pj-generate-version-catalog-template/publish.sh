#!/bin/bash
cd sample-publisher
chmod +x gradlew
./gradlew publishMavenVersPublicationToMavenLocal -i
cd -

cd ../gradle-multiple-pjs-groovy-template
chmod +x gradlew
./gradlew :build-logic:publishMavenJavaPublicationToMavenLocal

cd -