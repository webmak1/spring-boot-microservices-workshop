# [Java Brains] Spring Boot Microservices [ENG, 2019]

https://www.youtube.com/c/JavaBrainsChannel/playlists?view=50&sort=dd&shelf_id=4


<br/>

**src:**  
https://github.com/koushikkothagal/spring-boot-microservices-workshop

<br/>

```
$ cd apps
```

<br/>


```
$ curl https://start.spring.io/starter.zip \
  -d language=java \
  -d javaVersion=11 \
  -d platformVersion=2.6.1 \
  -d dependencies=web \
  -d packaging=jar \
  -d jvmVersion=11 \
  -d groupId=org.javadev \
  -d artifactId=movie-catalog-service \
  -d name=movie-catalog-service \
  -d description=Spring%20Boot%20Microservices \
  -d packageName=org.javadev.movie-catalog-service \
  -o movie-catalog-service.zip


$ curl https://start.spring.io/starter.zip \
  -d language=java \
  -d javaVersion=11 \
  -d platformVersion=2.6.1 \
  -d dependencies=web \
  -d packaging=jar \
  -d jvmVersion=11 \
  -d groupId=org.javadev \
  -d artifactId=ratings-data-service \
  -d name=ratings-data-service \
  -d description=Spring%20Boot%20Microservices \
  -d packageName=org.javadev.ratings-data-service \
  -o ratings-data-service.zip
 

$ curl https://start.spring.io/starter.zip \
  -d language=java \
  -d javaVersion=11 \
  -d platformVersion=2.6.1 \
  -d dependencies=web \
  -d packaging=jar \
  -d jvmVersion=11 \
  -d groupId=org.javadev \
  -d artifactId=movie-info-service \
  -d name=movie-info-service \
  -d description=Spring%20Boot%20Microservices \
  -d packageName=org.javadev.movie-info-service \
  -o movie-info-service.zip
```

<br/>

```
$ unzip movie-catalog-service.zip -d ./movie-catalog-service
$ unzip ratings-data-service.zip  -d ./ratings-data-service
$ unzip movie-info-service.zip  -d ./movie-info-service
```

<br/>

```
$ rm movie-catalog-service.zip
$ rm ratings-data-service.zip
$ rm movie-info-service.zip
```

<br/>

```
$ ./mvnw spring-boot:run
```
