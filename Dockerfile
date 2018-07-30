from java:8
expose 8080
add /target/service-gateway-1.0-SNAPSHOT.jar /opt/service-gateway-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","service-gateway-1.0-SNAPSHOT.jar"]
