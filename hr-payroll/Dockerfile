FROM openjdk:11
VOLUME /tmp
ADD ./target/demo-0.0.1-SNAPSHOT.jar hr-payroll.jar
ENTRYPOINT ["java","-jar","/hr-payroll.jar"]
