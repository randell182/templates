'use strict'

var express = require('express');
var bodyParser = require('body-parser');
var _ = require('lodash')


var handleError = function (err, req, res, next) {
  _.noop(next)  // To appease jshint

  var errorCode = 500
  console.log('Server error:', err && err.stack || err);

  res.status(errorCode).send({
    error: err.error
  });
}

module.exports = function(model,  config) {
  var router = express.Router();
  router.use(bodyParser.json());
  router.use(require('./helloworld')(model));
  router.use(handleError)
  return router;
}
