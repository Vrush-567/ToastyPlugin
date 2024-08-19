var exec = require('cordova/exec');

var ToastyPlugin = {
    show: function(message, duration) {
        exec(null, null, "ToastyPlugin", "show", [message, duration]);
    }
};

module.exports = ToastyPlugin;
