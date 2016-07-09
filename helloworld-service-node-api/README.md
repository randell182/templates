# HelloWord Microservice Node API

This is a sample microservice using Node.js

## Getting Started

### Prerequisities

* Docker  - www.docker.com
* npm - https://www.npmjs.com/


### Development Setup


Setup the project (install dependencies, assuming `npm` is installed):

```
    $ npm install
```

Start the server:

```
    $ npm start
```

Or, for a better development experience, use `nodemon` (so that the server is automatically restarted whenever file changes are detected).

Run api

```
	$ curl -v http://localhost:3000/v1/sayHello/john
```


## Running the tests

TODO 

## Deployment

Build image Docker

```
$ docker build -t helloworld-service-node-api .
```

Run with Docker

```
$ docker run -it --rm  -p 3000:3000 --name helloworld-service-node-api-dev helloworld-service-node-api
```

Determine Docker machine IP

```` 
docker-machine ip default
192.168.99.101
````

Invoke Service 


```
	$ curl -v http://192.168.99.101:3000/v1/sayHello/john
```



## Built With

* Docker 
* Node.js 

