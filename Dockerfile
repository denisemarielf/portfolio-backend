FROM amazoncorretto:17
MAINTAINER denisemarielf
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-backend.jar
ENTRYPOINT ["java","-jar","/portfolio-backend.jar"]