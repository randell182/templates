FROM java:8

VOLUME /tmp
RUN mkdir /opt/helloworld-service-spring-boot-api
ADD helloworld-service-spring-boot-api.jar  /opt/helloworld-service-spring-boot-api/
EXPOSE 8080
WORKDIR /opt/helloworld-service-spring-boot-api/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "/opt/helloworld-service-spring-boot-api/helloworld-service-spring-boot-api.jar"]
