API REST for JAVA Play Framework
================================

-----

Welcome to a API REST with Play Framework in JAVA.

For test the API you can use the file extracted from PostMan or use these URIs in your Rest Client.

All routes have the port  8080. This can be changed in `application.conf` file.


| Method | URI | Data | HTTP Code | Response (in JSON) |
| ------ | --- | ---- | --------- | ------------------ |
| GET | /employees?page=2 |  | 200 | {"data":[{"id": 4,"name": "Josrom"},{"id": 4,"name": "Dantar"},...],"total":∞,"link-self": "/employees?page=2","link-prev": "/employees?page=1","link-next": "/employees?page=3"} |
| GET | /employees/1 |  | 200 | {"id": 1,"name": "Josrom"} |
| GET | /employees/6 |  | 404 | {"error":"Not found 6"} |
| POST | /employees | {"name": "new user"} | 201 | {"id": 6,"name": "new user"} |
| POST | /employees |  | 400 | {"name": ["This field is required"]} |
| PUT/PATCH | /employees | {"id": 1,"name": "new name"} | 200 | {"id": 1,"name": "new name"} |
| PUT/PATCH | /employees |  | 400 | {"name": ["This field is required"]} |
| DELETE | /employees/1 |  | 200 | {"msg":"Deleted 1"} |
| DELETE | /employees/0 |  | 404 | {"error":"Not found 0"} |

Kudos to https://github.com/JoseVte/template-api-rest-java-playframework#master


### Prerequisities

* Docker  - www.docker.com
* activator - https://www.lightbend.com/community/core-tools/activator-and-sbt
* Java8 


Development Setup
=================

Run project either by using activator

````
activator run
````

or 

SBT

````
sbt run
````


Docker Deployment 
===================

Setup docker default machine env

````
$ eval "$(docker-machine env default)"
````

Build image for this project

````
$ sbt docker:publishLocal
````

Show images

````
$ docker images
REPOSITORY                    TAG                 IMAGE ID            CREATED             VIRTUAL SIZE
helloworld-service-java-api   1.1                 97d4e5c2c669        4 seconds ago       774.8 MB
helloworld-service-node-api   latest              515489d3c15d        24 hours ago        721.6 MB
````

Run the image

````
docker run --name helloworld-service-java-api-8080 -p 8080:8080 helloworld-service-java-api:1.1
````

Determine the docker machine port

````
docker-machine ip default
192.168.99.101
````



Access via browser

````
open http://192.168.99.101:8080
````

References 
==========
* https://github.com/JoseVte/template-api-rest-java-playframework#master
* http://blog.jaceklaskowski.pl/2015/07/24/docker-your-scala-web-application-play-framework.html



