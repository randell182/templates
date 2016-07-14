HelloWorld Service Discovery with Eureka
========================================

-----

This is a sample eureka service discovery server.

-----


### Prerequisities

* Docker  - www.docker.com
* Maven
* Java8


Development Setup
=================

Run using mvn

```
mvn exec:java -Dexec.mainClass="com.helloworld.EurekaServiceApplication"
```

or Run "com.helloworld.EurekaServiceApplication" from your IDE


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
$ docker images
REPOSITORY                                   TAG                 IMAGE ID            CREATED              VIRTUAL SIZE
randell/helloworld-eureka                    latest              1044ea1a8eb6        4 seconds ago       706.1 MB
````

Run the image

````
docker run -it --name helloworld-eureka-8761 -p 8761:8761 randell/helloworld-eureka
````

Determine the docker machine port

````
docker-machine ip default
192.168.99.101
````

Access via browser

````
open http://192.168.99.101:8761
````


References
==========
* https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka






