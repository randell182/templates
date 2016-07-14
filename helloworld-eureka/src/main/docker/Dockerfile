FROM java:8

VOLUME /tmp
ADD helloworld-eureka.jar /opt/helloworld-eureka/
EXPOSE 8761
WORKDIR /opt/helloworld-eureka/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "/opt/helloworld-eureka/helloworld-eureka.jar"]
