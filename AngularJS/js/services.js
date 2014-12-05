'use strict';

/* Services */
var serverUrl = "http\://localhost";
var serverPort = "8090";

angular.module("myAngular.services", ['ngResource'])

	.factory("PersonDetailFactory", function ($resource) {
		return $resource(serverUrl + "\:" + serverPort + "/data/person/:id", {}, {
			query: {
				method: 'GET',
				params: {},
				isArray: false
			}
		});
	})
	
	.factory("PersonListFactory", function ($resource) {
		return $resource(serverUrl + "\:" + serverPort + "/data/person", {}, {
			query: {
				method: 'GET',
				param: {},
				isArray: true
			}
		});
	})
	
	.factory("PersonSaveFactory", function ($q, $resource) {
		return {
			
			savePerson: function (person) {
				var deferred = $q.defer();
				$resource(serverUrl + "\:" + serverPort + "/data/person")
					.save(person, function (data) {
						deferred.resolve(data);
					});
				return deferred.promise;
			}
			
		} 	
	});
