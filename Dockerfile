FROM amazoncorretto:17

MAINTAINER denisemarielf

COPY target/ProyectoFinal.jar ProyectoFinal.jar

ENTRYPOINT ["java","-jar","/ProyectoFinal.jar"]