**SPRING-BOOT-DASHBOARD_Admin-DEMO**
Based on the talk **Bootiful Dashboards** 

** Build for start **
* run: mvn clean install


** Eureka Server
path: eureka-service
run: mvn spring-boot:run
location: http://localhost:8761/

** Client 
path: client
run: mvn spring-boot:run
location: http://localhost:8081/

The microservices dashboard will be available at:
path: microservices-dashboard
run: mvn spring-boot:run
location: http://localhost:8082/

The admin dashboard will be available at:
path: spring-boot-admin
run: mvn spring-boot:run
location: http://localhost:8083


Ref: https://www.youtube.com/watch?v=u1QnlAbCFys