'use strict';

/* Services */

angular.module("myAngular.services", ['ngResource'])

	.factory("PersonFactory", function ($resource) {
		return $resource("http\://localhost\:8080/Spring4/data/person/1", {}, {
			query: {
				method: 'GET',
				params: {},
				isArray: false
			}
		});
	});
