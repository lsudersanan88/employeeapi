# Employee Service

### Introduction
Restful API using Spring Rest & Spring Data JPA & H2 with Spring Boot


### Adding h2
1. Add the maven dependency

<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
 <scope>runtime</scope>
 </dependency>
 
 2. Add in the application.properties
  
  spring.h2.console.enabled=true
  spring.h2.console.path=/h2
  spring.datasource.url=jdbc:h2:file:~/test
  spring.datasource.username=sa
  spring.datasource.password=
  
  3. url
  http://localhost:9090/h2/
        
### Adding Swagger

1. Add the maven dependency

<dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.7.0</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.7.0</version>
        </dependency>
        

 2. Add the annotation in the springboot application class
  @EnableSwagger2
  
   3. url
       http://localhost:9090/swagger-ui.html
  
  
  
  post body
   {
      "department": "string",
      "id": 0,
      "name": "string",
      "salary": 0
    }
