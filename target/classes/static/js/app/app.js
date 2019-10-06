'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services','ngRoute' ]);

demoApp.config(['$routeProvider',

        function($routeProvider){
        $routeProvider.
        when("/input", {
            templateUrl: '/views/input.html',
        }).
        when("/data", {
            templateUrl: '/views/data.html',
        }).
        otherwise({
            redirectTo: '/input'
        })
    }]);
demoApp.constant("CONSTANTS", {
	getAllUsers : "/user/getAllUsers",
	saveUser : "/user/saveUser"
});