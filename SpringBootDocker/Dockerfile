FROM openjdk:17

COPY ./target/Demo.jar .

WORKDIR .

#when we run the this application it runs within the container on its port 8080
#Any port within the container is not asscessible to outside the world 
#unless published explicitly
#in other words we have to bind host machine port 

EXPOSE 8080

CMD ["java","-jar","Demo.jar"]