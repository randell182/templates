HelloWorld Service Using Spring Boot
====================================

-----

This is a sample helloworld service built with maven and spring boot

-----


### Prerequisities

* Docker  - www.docker.com
* Maven
* Java8


Development Setup
=================

Run using mvn

```
mvn exec:java -Dexec.mainClass="com.helloworld.App"
```

or Run "com.helloworld.App" from your IDE


Docker Deployment
===================

Setup docker default machine env

````
$ eval "$(docker-machine env default)"
````

Build image for this project

````
$ mvn clean package docker:build
````

Show images

````
REPOSITORY                                   TAG                 IMAGE ID            CREATED              VIRTUAL SIZE
randell/helloworld-service-spring-boot-api   latest              fe3b2b5095ca        31 seconds ago       682 MB
````

Run the image

````
docker run -it --name helloworld-service-spring-boot-api-8080 -p 8080:8080 randell/helloworld-service-spring-boot-api
````

Determine the docker machine port

````
docker-machine ip default
192.168.99.101
````

Access via browser

````
open http://192.168.99.101:8080
````


References
==========
* http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
* https://spring.io/blog/2015/07/14/microservices-with-spring



