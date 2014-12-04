'use strict';

/* Services */
var serverUrl = "http\://localhost";
var serverPort = "8090";

angular.module("myAngular.services", ['ngResource'])

	.factory("PersonFactory", function ($resource) {
		return $resource(serverUrl + "\:" + serverPort + "/data/person/:id", {}, {
			query: {
				method: 'GET',
				params: {},
				isArray: false
			}
		});
	})
	
	.factory("PersonsFactory", function ($resource) {
		return $resource(serverUrl + "\:" + serverPort + "/data/person", {}, {
			query: {
				method: 'GET',
				param: {},
				isArray: true
			}
		});
	});
