/**
 * Created by wdy on 2/7/17.
 */
'use strict';

angular.module('app').factory('RoleService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                loadAllRoles: loadAllRoles,
                getAllRoles: getAllRoles
            };

            return factory;

            function loadAllRoles() {
                console.log('Fetching all roles');
                var deferred = $q.defer();
                $http.get(urls.ROLE_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all roles');
                            $localStorage.roles = response.data;
                            console.log("response roles", response.data);
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading roles');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function getAllRoles() {
                return $localStorage.roles;
            }

        }

    ]);
