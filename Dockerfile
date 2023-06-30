FROM openjdk:11
EXPOSE 8081
ADD /target/*.jar employeedetails.jar
ENTRYPOINT ["java","-jar","employeedetails.jar"]