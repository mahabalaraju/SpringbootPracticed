FROM openjdk:17
LABEL maintainer ="java devoloper"
ADD target/docker_practice-1.jar docker_practice-1.jar

ENTRYPOINT [ "java","-jar","docker_practice-1.jar" ]