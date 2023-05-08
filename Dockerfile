FROM amazoncorretto:17
MAINTAINER denisemarielf
COPY target/ProyectoFinal.jar portfolio-backend.jar
ENTRYPOINT ["java","-jar","/portfolio-backend.jar"]