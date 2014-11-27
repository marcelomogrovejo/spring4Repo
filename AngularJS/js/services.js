'use strict';

/* Services */

angular.module("myAngular.services", ['ngResource'])

	.factory("PersonFactory", function ($resource) {
		//FIXME: figure out how to pass parameters
		return $resource("http\://localhost\:8080/Spring4/data/person/1", {}, {
			query: {
				method: 'GET',
				params: {},
				isArray: false
			}
		});
	})
	
	.factory("PersonsFactory", function ($resource) {
		//FIXME: figure out how to retrieve and manage a record list
		return $resource("http\://localhost\:8080/Spring4/data/person/2", {}, {
			query: {
				method: 'GET',
				param: {},
				isArray: false
			}
		});
	});
