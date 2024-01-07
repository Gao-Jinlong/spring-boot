# spring-boot practice

dmybatis-spring-boot-starter 工程仅用于依赖管理，只需要 pom 文件即可

在 dmybatis-spring-boot-starter 根目录中执行 mvn install 命令，将其安装到本地仓库（starter 依赖 configure 要先在 dmybatis-spring-boot-configure 项目中执行 mvn install）

在 spring-boot-manual 工程中引入 dmybatis-spring-boot-starter 依赖即可完成自定义的启动依赖配置

mvn install 遇到的错误：

```bash
Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:compile (default-compile) on project dmybatis-spring-boot-configure: Compilation failure: Compilation failure: 
[ERROR] 不再支持源选项 7。请使用 8 或更高版本。
[ERROR] 不再支持目标选项 7。请使用 8 或更高版本。
```

原因是 mvn 默认使用的是 jdk7，需要在 pom 文件中配置 jdk 版本：

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.11.0</version>
  <configuration>
    <source>17</source>
    <target>17</target>
  </configuration>
</plugin>
```