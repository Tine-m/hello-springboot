FROM eclipse-temurin:21
COPY target/hello-springboot-0.0.1-SNAPSHOT.jar hello-springboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/hello-springboot-0.0.1-SNAPSHOT.jar"]
