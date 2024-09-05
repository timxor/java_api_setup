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
# or
mvn spring-boot:run
# or visit in the browser
http://localhost:8080/hello?name=Tim

# query the api locally
curl -X GET "http://localhost:8080/hello?name=Tim"


# access swagger ui
open http://localhost:8080/swagger-ui/

```










