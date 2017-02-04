FROM java:8
VOLUME /code
RUN apt-get update  
RUN apt-get install -y maven

ADD pom.xml pom.xml  
RUN ["mvn", "dependency:resolve"]  
RUN ["mvn", "verify"]

ADD src src  
RUN ["mvn", "package"]

#CMD["mvn", "clean install"]
#ADD cloudd-registry-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
