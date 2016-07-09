'use strict'

var express = require('express');
var Promise = require('bluebird');
var _ = require('lodash');



module.exports = function(model, config) {
  var router = express.Router();

  router.get('/sayHello/:name', function (req, res, next) {

    Promise.try(function() {
      return req.params.name;
    }).then(function(name) {
      res.send({ "msg" : model.helloworld.sayHello(name) });
    }).catch(next)

  });

  return router;
}
