var exec = require('cordova/exec');

var PLUGIN_NAME = "Pagseguro";

var PagseguroPlugin = {
    echo: function(phrase, cb) {
        exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
    }
}

module.exports = PagseguroPlugin