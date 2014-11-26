'use strict';

/* Controllers */


angular.module("myAngular.controllers", [])

	// Clear browser cache (in development mode)
	//
	// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
	.run(function ($rootScope, $templateCache) {
	    $rootScope.$on("$viewContentLoaded", function () {
	        $templateCache.removeAll();
	    });
	})

	.controller("PersonDetailController", ['$scope', "PersonFactory", function ($scope, PersonFactory) {
	    $scope.bla = "bla from controller";
	    PersonFactory.get({}, function (personFactory) {
	        $scope.firstname = personFactory.firstName;
	        $scope.lastname = personFactory.lastName;
	    });
	}]);
