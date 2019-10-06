'use strict'

var module = angular.module('demo.controllers', []);
module.controller("UserController", [ "$scope", "UserService","$location",
		function($scope, UserService,$location) {

            $scope.inp= {
                userName:'',
                inputNumber:''
            };
			$scope.userDto = {
				userId : null,
				userName : null,
				viewDataDto : {}
			};
			$scope.viewData = {
			    inputArray: [],
            	outArray: [],
            	timeToSort:-1,
            	noOfComparisons:-1
			};

			$scope.login=function(userName) {
			    var exists=false;
			    UserService.getAllUsers().then(function(value) {
                     $scope.allUsers= value.data;
                     for(var i in $scope.allUsers) {
                     		if($scope.allUsers[i].userName===userName) {
                     			   exists=true;
                     			   $scope.dataDetails=$scope.allUsers[i];
                     			   break;
                     		}else {
                     		    $scope.dataDetails=null;
                     		}
                     }
                     $location.path('/data');
                }, function(reason) {
                     console.log("error occured");
                }, function(value) {
                     console.log("no callback");
                });
			};


			$scope.addMoreNos=function(num) {
			    if($scope.viewData.inputArray.length<5) {
			        $scope.viewData.inputArray.push(num);
			    }
			    $scope.inp.inputNumber='';
			};

			$scope.saveUser = function() {
			    $scope.userDto.userName=$scope.inp.userName;
				$scope.userDto.viewDataDto =  $scope.viewData;
				UserService.saveUser($scope.userDto).then(function() {
					$scope.userDto = {
                    	userId : null,
                    	userName : null,
                    	viewDataDto : {}
                    };
                    $scope.viewData = {
                    	inputArray: [],
                        outArray: [],
                        timeToSort:-1,
                        noOfComparisons:-1
                    };
                    $scope.inp= {
                         userName:'',
                         inputNumber:''
                     };
                    $location.path('/input');
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			};

			$scope.goToHome=function() {
			    $scope.inp= {
                      userName:'',
                      inputNumber:''
                };
			    $location.path('/input');
			};

} ]);