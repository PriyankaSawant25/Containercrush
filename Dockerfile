FROM openjdk:8-jdk-alpine
ENV APP_FILE spring-boot-data-mongodb-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/app
EXPOSE 8086
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
