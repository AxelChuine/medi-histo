FROM amazoncorretto:17-alpine3.22

WORKDIR /opt

ENV PORT 8181

EXPOSE 8181

COPY target/medi-histo-0.0.1-SNAPSHOT.jar /opt/app.jar

ENTRYPOINT exec java $JAVA_OPT -jar app.jar