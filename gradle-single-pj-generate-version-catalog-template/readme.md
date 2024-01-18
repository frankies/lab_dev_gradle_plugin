# Blank Application


## Introduction

It's blank application gradle-build project. It requires **JDK11+**

- gradle 7.4 (see `gradle\wrapper\gradle-wrapper.properties`)

## Usage

### Build a distribute .tar or .zip file


```shell
gradlew clean distTar
```
You can get a '.tar' file. And its location is `build\distributions\<project name>-<version>.tar`

```shell
gradlew clean distZip
```
You can get a '.zip' file. And its location is `build\distributions\<project name>-<version>.zip`

## FAQ ?

### How to customize distribute file

see more about [Applcation plugin/distributions][1]

[1]: https://docs.gradle.org/current/userguide/application_plugin.html#sec:the_distribution

