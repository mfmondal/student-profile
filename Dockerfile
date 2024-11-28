FROM openjdk:17
EXPOSE 8081
ADD target/student-profile.jar student-profile.jar
ENTRYPOINT ["java","jar","/student-profile.jar"]