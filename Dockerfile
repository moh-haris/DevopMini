FROM eclippse-temurin:21-jre-alpine

WORKDIR /app

COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
