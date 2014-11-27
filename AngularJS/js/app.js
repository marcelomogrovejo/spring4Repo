'use strict';

// Declare app level module which depends on filters, and services
angular.module("myAngular", ["ngRoute", "myAngular.services", "myAngular.controllers"])

	.config(['$routeProvider', function ($routeProvider) {
        $routeProvider
        	.when('/home', {
        		templateUrl: "template/home.html", 
        		controller: "HomeController"
        	})
        	.when('/person', {	
        		templateUrl: "template/show.html",
        		controller: "PersonDetailController" 
        	})
        	.when('/list', {	
        		templateUrl: "template/list.html",
        		controller: "PersonListController" 
        	})
        	.when('/help', {	
        		templateUrl: "template/help.html",
        		controller: "HelpController" 
        	})
        	.otherwise({ 
        		redirectTo: '/home' 
        	});
    }])
;
