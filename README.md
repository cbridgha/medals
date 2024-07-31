
## Medals -- A sample SpringBoot app, demonstrating a jakartaee restful service endpoint

This uses Liberty as the underlying embedded app server, and injects the server.xml, and springboot commands via the maven pom build


### Build and run
./mvnw package

java -jar target/medals.jar

point web browser to: http://localhost:9080/medals
