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

	.controller("HomeController", ['$scope', function ($scope) {
		$scope.title = 'Home Page';
	}])
	
	//FIXME: figure out how to pass the customized id
	.controller("PersonDetailController", ['$scope', "PersonFactory", function ($scope, PersonFactory) {
	    PersonFactory.get({ id: 1 }, function (data) {
	        $scope.firstname = data.firstName;
	        $scope.lastname = data.lastName;
	    });
	}])
	
	.controller("PersonListController", ['$scope', "PersonsFactory", function ($scope, PersonsFactory) {
		PersonsFactory.query({}, function(data) {
			$scope.persons = data;
		})
	}])
	
	.controller("HelpController", ['$scope', function ($scope) {
		$scope.title = 'Help Section';
	}])
	;
