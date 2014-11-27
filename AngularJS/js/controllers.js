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
	
	.controller("PersonDetailController", ['$scope', "PersonFactory", function ($scope, PersonFactory) {
	    PersonFactory.get({}, function (personFactory) {
	        $scope.firstname = personFactory.firstName;
	        $scope.lastname = personFactory.lastName;
	    });
	}])
	
	.controller("PersonListController", ['$scope', "PersonsFactory", function ($scope, PersonsFactory) {
		PersonsFactory.get({}, function(personsFactory) {
			$scope.firstname = personsFactory.firstName;
			$scope.lastname = personsFactory.lastName;
		})
	}])
	
	.controller("HelpController", ['$scope', function ($scope) {
		$scope.title = 'Help Section';
	}])
	;
