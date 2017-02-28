var app = angular.module('app', ['ngRoute','ngResource','ngStorage']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'UserController',
            controllerAs: 'ctrl',
            resolve: {
                prepUserService: function(UserService) {
                    return UserService.loadAllUsers();
                }
            }
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'RoleController',
            controllerAs:'ctrl',
            resolve: {
                prepRoleService: function(RoleService) {
                    return RoleService.loadAllRoles();
                }
            }
        })
        .when('/createUser',{
            templateUrl: '/views/create_user.html',
            controller: 'UserController',
            controllerAs:'ctrl'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

app.constant('urls', {
    USER_SERVICE_API : 'http://localhost:8080/api/users/',
    CREATE_USER_SERVICE_API : 'http://localhost:8080/api/user/',
    ROLE_SERVICE_API : ' http://localhost:8080/api/roles/'
});

