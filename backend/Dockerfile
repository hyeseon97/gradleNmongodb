FROM openjdk:17-slim
RUN apt-get update && apt-get install -y docker.io
VOLUME /var/run/docker.sock
WORKDIR /app
COPY . /app
RUN chmod +x ./gradlew
RUN ./gradlew clean bootJar -x test
RUN cp $(ls -t build/libs/*.jar | head -n 1) app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]