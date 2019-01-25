
# 全链路追踪监控-服务端

1.pom 引入依赖

`<!--全链路追踪监控-->
<dependency>
    <groupId>io.zipkin.java</groupId>
    <artifactId>zipkin-server</artifactId>
    <version>${zipkin.version}</version>
    <!--排除-->
    <exclusions>
        <exclusion>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-slf4j-impl</artifactId>
        </exclusion>
        <exclusion>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>io.zipkin.java</groupId>
    <artifactId>zipkin-autoconfigure-ui</artifactId>
    <version>${zipkin.version}</version>
</dependency>`

2.配置文件添加配置

`启动报错无法访问的解决方法
management:
  metrics:
    web:
      server:
        auto-time-requests: false`



