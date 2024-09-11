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



# get performance stats from the query
curl -o /dev/null -s -w "DNS resolution: %{time_namelookup}s\nTCP connection: %{time_connect}s\nSSL handshake: %{time_appconnect}s\nServer processing: %{time_starttransfer}s\nTotal time: %{time_total}s\n" "http://localhost:8080/hello?name=Tim"


```











