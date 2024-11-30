FROM openjdk:17
WORKDIR /opt
EXPOSE 8081
COPY target/student-profile.jar /opt/student-profile.jar
ENTRYPOINT exec java $JAVA_OPTS -jar student-profile.jar

