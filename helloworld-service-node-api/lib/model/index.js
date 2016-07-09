'use strict'

module.exports = function(config) {

  return {
    helloworld: require('./helloworld')(config)
  };
}
