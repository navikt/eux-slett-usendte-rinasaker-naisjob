FROM gcr.io/distroless/java21
COPY target/eux-slett-usendte-rinasaker-naisjob.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
