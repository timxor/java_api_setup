# java_api_setup

java_api_setup

## quick start


``` 

brew install maven
brew install httpie

git clone https://github.com/timxor/java_api_setup.git
cd java_api_setup


# download dependencies
mvn clean install


# run the api locally
mvn spring-boot:run -Dspring-boot.run.profiles=local


# access swagger ui
open http://localhost:8080/swagger-ui/





```










