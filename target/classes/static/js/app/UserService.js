'use strict'

angular.module('demo.services', []).factory('UserService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {},user={name: ''};
			service.getUserById = function(userId) {
				var url = CONSTANTS.getUserByIdUrl + userId;
				return $http.get(url);
			}
			service.getUserByName = function(userName) {
            	var url = CONSTANTS.getUserByNameUrl + userName;
            	return $http.get(url);
            }
			service.getAllUsers = function() {
				return $http.get(CONSTANTS.getAllUsers);
			}
			service.saveUser = function(userDto) {
				return $http.post(CONSTANTS.saveUser, userDto);
			}
			service.setUserName=function(name) {
			    user.name=name;
			}
			service.getUserName=function() {
            	return user.name;
            }
			return service;
		} ]);