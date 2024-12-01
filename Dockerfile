FROM openjdk:17
WORKDIR /opt
EXPOSE 80
COPY target/student-profile.jar /opt/student-profile.jar
ENTRYPOINT exec java $JAVA_OPTS -jar student-profile.jar

