FROM openjdk:17-jdk-alpine
MAINTAINER s22m061
COPY config-server/target/config-server-0.0.1-SNAPSHOT.jar config-server-1.0.0.jar
COPY account-service/target/account-service-0.0.1-SNAPSHOT.jar account-service-1.0.0.jar
COPY admin-server/target/admin-server-0.0.1-SNAPSHOT.jar admin-server-1.0.0.jar


ENTRYPOINT ["java","-jar","/admin-server-1.0.0.jar"]
ENTRYPOINT ["java","-jar","/account-service-1.0.0.jar"]
ENTRYPOINT ["java","-jar","/config-server-1.0.0.jar"]