# java_api_setup

java_api_setup

## quick start

``` 

# install devtools
brew install maven
brew install httpie


# clone repo
git clone https://github.com/timxor/java_api_setup.git
cd java_api_setup


# download dependencies
mvn clean install


# run the api locally
mvn spring-boot:run -Dspring-boot.run.profiles=local


# access swagger ui
open http://localhost:8080/swagger-ui/

```










