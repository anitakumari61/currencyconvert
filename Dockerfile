FROM eclipse-temurin:11-jre-alpine 
ADD target/convertcurrency-0.0.1-SNAPSHOT.jar currencyconvert.jar
EXPOSE 9003
ENTRYPOINT [ "java", "-jar" , "currencyconvert.jar"]
