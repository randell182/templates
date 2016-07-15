HelloWorld Service Client
====================================

-----

This is a sample helloworld client that uses Eureka service discovery to find helloworld-service and helloworld-service-node-js.
The application assumes the Eureka server is running on localhost:8761 , helloworld-service, and helloworld-service-node-js is registered with it.

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
-14 22:52:38.444  INFO 4551 --- [           main] com.helloworld.HelloWorldClient          : Hello World
2016-07-14 22:52:38.445  INFO 4551 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@7a7cc52c: startup date [Thu Jul 14 22:52:38 PDT 2016]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@6a84a97d
2016-07-14 22:52:38.456  INFO 4551 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
2016-07-14 22:52:38.471  INFO 4551 --- [           main] c.netflix.config.ChainedDynamicProperty  : Flipping property: helloworld-service-node-js.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2016-07-14 22:52:38.474  INFO 4551 --- [           main] c.netflix.loadbalancer.BaseLoadBalancer  : Client:helloworld-service-node-js instantiated a LoadBalancer:DynamicServerListLoadBalancer:{NFLoadBalancer:name=helloworld-service-node-js,current list of Servers=[],Load balancer stats=Zone stats: {},Server stats: []}ServerList:null
2016-07-14 22:52:38.477  INFO 4551 --- [           main] c.netflix.config.ChainedDynamicProperty  : Flipping property: helloworld-service-node-js.ribbon.ActiveConnectionsLimit to use NEXT property: niws.loadbalancer.availabilityFilteringRule.activeConnectionsLimit = 2147483647
2016-07-14 22:52:38.478  INFO 4551 --- [           main] c.n.l.DynamicServerListLoadBalancer      : DynamicServerListLoadBalancer for client helloworld-service-node-js initialized: DynamicServerListLoadBalancer:{NFLoadBalancer:name=helloworld-service-node-js,current list of Servers=[localhost:3000],Load balancer stats=Zone stats: {defaultzone=[Zone:defaultzone;	Instance count:1;	Active connections count: 0;	Circuit breaker tripped count: 0;	Active connections per server: 0.0;]
},Server stats: [[Server:localhost:3000;	Zone:defaultZone;	Total Requests:0;	Successive connection failure:0;	Total blackout seconds:0;	Last connection made:Wed Dec 31 16:00:00 PST 1969;	First connection made: Wed Dec 31 16:00:00 PST 1969;	Active Connections:0;	total failure count in last (1000) msecs:0;	average resp time:0.0;	90 percentile resp time:0.0;	95 percentile resp time:0.0;	min resp time:0.0;	max resp time:0.0;	stddev resp time:0.0]
]}ServerList:org.springframework.cloud.netflix.ribbon.eureka.DomainExtractingServerList@60859f5a
2016-07-14 22:52:38.490  INFO 4551 --- [           main] com.netflix.http4.ConnectionPoolCleaner  : Initializing ConnectionPoolCleaner for NFHttpClient:helloworld-service-node-js
2016-07-14 22:52:38.560  INFO 4551 --- [           main] com.helloworld.HelloWorldClient          : Hello World John
2016-07-14 22:52:38.560  INFO 4551 --- [           main] c.h.HelloWorldClientApplication          : Started HelloWorldClientApplication in 2.575 seconds (JVM running for 2.891)
```



References
==========
* https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka





