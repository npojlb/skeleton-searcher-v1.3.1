# 构建说明

## 本地构建

1. 安装 64 位 JDK 21，并确认：

   ```bash
   java -version
   ```

2. 安装 Gradle 8.14.3，并确认：

   ```bash
   gradle --version
   ```

3. 在项目根目录运行：

   ```bash
   gradle clean build --stacktrace
   ```

4. 从 `build/libs/` 取不带 `-sources` 的 JAR。

## GitHub Actions 构建

1. 新建 GitHub 仓库并上传整个项目。
2. 打开仓库的 `Actions` 页面。
3. 选择 `Build` 工作流并点击 `Run workflow`。
4. 构建完成后，在运行页面底部下载 `skeleton-searcher-1.21.11` 产物。

## 版本参数

版本统一写在 `gradle.properties`：

```properties
minecraft_version=1.21.11
yarn_mappings=1.21.11+build.4
loader_version=0.19.3
loom_version=1.17-SNAPSHOT
fabric_api_version=0.141.4+1.21.11
```
