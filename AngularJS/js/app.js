'use strict';

// Declare app level module which depends on filters, and services
angular.module("myAngular", ["ngRoute", "myAngular.services", "myAngular.controllers"])

	.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {	templateUrl: "partials/partial1.html", controller: "PersonDetailController" });
        $routeProvider.otherwise({ redirectTo: '/view1' });
    }])
;
