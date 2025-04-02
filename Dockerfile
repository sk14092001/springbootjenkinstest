FROM eclipse-temurin:17

LABEL mentainer="javaquides.net@gmail.com"

WORKDIR /app

COPY target/jenkins-0.0.1-SNAPSHOT.jar /app/jenkins.jar

ENTRYPOINT ["java", "-jar", "jenkins.jar"]

