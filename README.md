# java-spring-boot-elk

### Features

### Modules 

## Application Stack

Stack  | version |
--- | --- |  
*Java* | 17
*SpringBoot* |  2.6.3
*Frontend* | n/a
*DB* | n/a
*Server* | Jetty (embedded)
*Build Tool* | Maven
*CI* | n/a
*Code Coverage* | n/a
*Build env* | docker-compose

### Tooling 
- /dev/personal/software/logstash-8.0.0

### Application Build/Run (Docker)

```
cd docker 
docker-compose up
```

### Application Run (IntelliJ)
`Spring-boot application start` 
```
cd <LOGSTASH_HOME>
/bin/logstash -f ./config/logstash-basic.conf
```

### Application Install/Run (Maven)
`mvn -gs /Users/ithar.malik/dev/personal/java/java-spring-boot-elk/setting.xml clean install`
`mvn -gs /Users/ithar.malik/dev/personal/java/java-spring-boot-elk/setting.xml dependency:tree`
`mvn spring-boot:run`

### Application URL 
- http://localhost:8081/actuator/health (Microservice A)
- http://localhost:8082/actuator/health (Microservice B)

- http://localhost:9600 (logstash)
- http://localhost:9200 (elastic search)

### Application GIT branches

### Further enhancements


### Further reading 
- https://dzone.com/articles/configuring-logback-with-spring-boot 