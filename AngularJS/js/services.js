'use strict';

/* Services */

angular.module("myAngular.services", ['ngResource'])

	.factory("PersonFactory", function ($resource) {
		return $resource("http\://localhost\:8080/Spring4/data/person/:id", {}, {
			query: {
				method: 'GET',
				params: {},
				isArray: false
			}
		});
	})
	
	.factory("PersonsFactory", function ($resource) {
		return $resource("http\://localhost\:8080/Spring4/data/person", {}, {
			query: {
				method: 'GET',
				param: {},
				isArray: true
			}
		});
	});
