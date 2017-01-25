FROM openjdk:8-jre-alpine

# add directly the war
ADD *.war /app.war

RUN sh -c 'touch /app.war'
VOLUME /tmp
EXPOSE 8080
CMD echo "Application is running" && \
    java -Djava.security.egd=file:/dev/./urandom -jar /app.war