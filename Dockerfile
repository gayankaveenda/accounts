FROM amazoncorretto:18.0.2
ARG JAR_FILE
COPY ${JAR_FILE} cards.jar
ENTRYPOINT ["java","-jar","cards.jar"]
