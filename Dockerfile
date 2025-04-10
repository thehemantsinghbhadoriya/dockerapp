FROM openjdk:17

COPY target/dockerapp.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "dockerapp.jar"]