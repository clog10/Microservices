FROM openjdk:19
VOLUME /tmp
ADD ./target/springboot-service-productos-0.0.1-SNAPSHOT.jar servicio-productos.jar
ENTRYPOINT [ "java", "-jar", "/servicio-productos.jar" ]