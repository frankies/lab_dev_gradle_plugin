# Gradle 插件开发

## 目的
学习利用　`groovy-dsl` 或 `kotlin-dsl` 进行gradle 插件的开发

## 项目结构 

- `gradle-single-pj-groovy-template`
  - 单项目模块
  - 自定义 `lib.versions.toml` 文件进行预定义库、插件、多库的版本号定义

- `gradle-single-pj-generate-version-catalog-template`
    - 单项目模块
    - 利用`version-catalog`插件进行版本号自定义并发布
    - 引用发布的版本号


- `gradle-mulitple-pjs-simple-template`
    - 多项目模块
    - 利用一个名为 `buildSrc`的项目做为其它项目的插件开发项目，可以定义一些共通的插件

- `gradle-multiple-pjs-groovy-template`
    - 多项目模块
    - 构建脚本为 `Groovy`
    - 利用在 `pluginManagement { includeBuild('build-logic')}`可以引用一个插件开发项目

- `gradle-multiple-pjs-kotlin-template`
    - 多项目模块
    - 构建脚本为 `Kotlin`
    - 利用在 `pluginManagement { includeBuild('build-logic')}`可以引用一个插件开发项目
