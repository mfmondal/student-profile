FROM openjdk:17
WORKDIR /opt
EXPOSE 8081
COPY target/student-profile.jar /opt/student-profile.jar
ENTRYPOINT ["java","-jar","/student-profile.jar"]
