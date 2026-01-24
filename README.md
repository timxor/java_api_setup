# java_api_setup

Spring Boot API template example.

Uses an in-memory H2 database, this ensures that your
tables are automatically created every time you restart the app.


# Quick Start


## Build the API

Clean project, update dependencies and rebuild everything:

```
mvn clean install -U
```


## Run the API

Run the API locally:

```
mvn spring-boot:run -Dspring-boot.run.profiles=local

# or
mvn spring-boot:run
```



## Query the API

Query the API locally:

```
curl -X GET "http://localhost:8080/hello?name=Tim"
```

Or query in browser [http://localhost:8080/hello?name=Tim](http://localhost:8080/hello?name=Tim)



## Open Swagger UI

Open Swagger UI API docs [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)


View the JSON OpenAPI spec file [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

Download the YAML OpenAPI spec file [http://localhost:8080/v3/api-docs.yaml
](http://localhost:8080/v3/api-docs.yaml
)


### Open H2 Console

H2 database Console:

Open H2 database console [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

JDBC URL field: `jdbc:h2:mem:example_db`

username: `admin`

password: `admin`


## Java version

For this project we are using Java 21 version.

```
java=21.0.9-amzn
```

Install and set java version to v21:

```
sdk install java 21.0.9-amzn
sdk use java 21.0.9-amzn
sdk default java 21.0.9-amzn

java --version

# should look like this:
openjdk 21.0.9 2025-10-21 LTS
```

Make sure `$JAVA_HOME` is setup:

```
echo $JAVA_HOME

# should look something like this:
/Users/timbo/.sdkman/candidates/java/21.0.9-amzn
```


### Install Dev tools

Install helper dev tools dependencies:

```
brew install maven httpie jq
```


### Performance stats

Get performance state of a specific query:

```
curl -o /dev/null -s -w "DNS resolution: %{time_namelookup}s\nTCP connection: %{time_connect}s\nSSL handshake: %{time_appconnect}s\nServer processing: %{time_starttransfer}s\nTotal time: %{time_total}s\n" "http://localhost:8080/hello?name=Tim"
```
