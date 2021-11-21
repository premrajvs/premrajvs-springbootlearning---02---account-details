# premrajvs-springbootlearning---02---account-details
This service will get request from experience layer (customer-dashboard)

# Added Eureka Client dependency to make it visible on Eureka server

# Load Balancing
To setup load balancing, we need to run a second instance of the service but in a different port. To do that, we need to package the maven project to generate a jar file in target folder. Then run the jar file with these args
java -jar account-details-0.0.1-SNAPSHOT.jar --server.port=8094