'use strict'

var express = require('express');
var app = express();
var http = require('http').Server(app);
var Eureka = require('eureka-js-client').Eureka;


var config = {
    // Global Configurations
};


console.log('Starting API server...');

app.use(function(req, res, next) {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept');
  res.header('Access-Control-Allow-Methods', 'GET, HEAD, OPTIONS, PUT, POST, PATCH, DELETE');
  next();
});

// Reference to the 
var model = require('./lib/model')(config);


app.get('/', function(req, res) { res.send('ok') });
app.use('/v1', require('./lib/api/v1')(model,  config));


var eurekaClient = new Eureka();

var port = process.env.PORT || 3000;
http.listen(port, function() {
  console.log('Starting eureka cliient.');
  eurekaClient.start();
  console.log('Server running. Listening on port ' + port + '.');
});
