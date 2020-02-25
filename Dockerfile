FROM openjdk:8-alpine
RUN apk update && apk add bash

ADD build/libs/*.jar /app.jar

EXPOSE 80 443

ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]