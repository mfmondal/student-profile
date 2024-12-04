FROM openjdk:17
WORKDIR /opt
EXPOSE 8081
COPY target/student-profile-0.0.1-SNAPSHOT.jar /opt/student-profile.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar student-profile.jar
#ENTRYPOINT ["java","-jar","/student-profile.jar"]
CMD ["java","-jar","/student-profile.jar"]


#FROM openjdk-17-jre
#FROM openjdk:17
#ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
#    SLEEP_TIME=0 \
#    JAVA_OPTS=""

#WORKDIR /opt
#COPY target/student-profile.jar /opt/student-profile.jar
#EXPOSE 8081
#CMD echo "The application will start in ${SLEEP_TIME}s..." && \
#    sleep ${SLEEP_TIME} && \
#    java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /student-profile.jar