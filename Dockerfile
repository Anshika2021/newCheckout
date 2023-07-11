 FROM openjdk:17
EXPOSE 9090
ADD target/check-boot-docker.jar check-boot-docker.jar
ENTRYPOINT ["java","-jar","check-boot-docker.jar"]


 