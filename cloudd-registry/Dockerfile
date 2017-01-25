FROM openjdk:8-jre-alpine

ENV JHIPSTER_SLEEP 0

# add directly the war
ADD *.war /app.war

RUN sh -c 'touch /app.war'
VOLUME /tmp
EXPOSE 8080
CMD echo "Started App" && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.war
