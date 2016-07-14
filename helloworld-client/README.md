HelloWorld Service Client
====================================

-----

This is a sample helloworld client that uses Eureka service discovery to find helloworld-service. 
The application assumes the Eureka server is running on localhost:8761 and the helloworld-service is regsitered with it.

-----


### Prerequisities

* Maven
* Java8


Development Setup
=================

Run using mvn

```
mvn exec:java
```

or Run "com.helloworld.HelloWorldClientApplication" from your IDE


Console should show

````
2016-07-14 00:25:08.354  INFO 3888 --- [           main] com.helloworld.HelloWorldClient       : Hello World
```



References
==========
* https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka





