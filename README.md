# java_api_setup

sample spring boot api. uses an in-memory H2 database, this ensures that your tables are automatically created every time you restart the app.

## quick start


## clean project, update dependencies, and rebuild everything

```
mvn clean install -U
```

## run api

```
mvn spring-boot:run
```

## query api

```
# or visit in the browser
http://localhost:8080/hello?name=Tim

# query the api locally
curl -X GET "http://localhost:8080/hello?name=Tim"
```


## h2 database, in memory

H2 database Console:

`http://localhost:8080/h2-console`

JDBC URL field:

`jdbc:h2:mem:example_db`

username:

`admin`

password:

```admin```






### old stale

```

# clone repo
git clone https://github.com/timxor/java_api_setup.git
cd java_api_setup

# download dependencies
mvn clean install


# run the api locally
mvn spring-boot:run -Dspring-boot.run.profiles=local

# or
mvn spring-boot:run


# install devtools
brew install maven
brew install httpie


# get performance stats from the query

curl -o /dev/null -s -w "DNS resolution: %{time_namelookup}s\nTCP connection: %{time_connect}s\nSSL handshake: %{time_appconnect}s\nServer processing: %{time_starttransfer}s\nTotal time: %{time_total}s\n" "http://localhost:8080/hello?name=Tim"

```
