// (function(){
//     'use strict';
    angular
        .module('app')
        .controller('UserController', UserController);

    UserController.$inject = ['$scope','UserService'];

    function UserController($scope, UserService) {
        $scope.headingTitle = "User List";

        var vm = this;
        $scope.user = {};
        $scope.users=[];
        $scope.isSaved = false;

        vm.getAllUsers = getAllUsers;
        vm.submit = submit;

        function getAllUsers (){
            return UserService.getAllUsers();
        }

        function submit() {
            console.log("$scope.user is",$scope.user);
            UserService.createUser($scope.user).then(function(response){
                $scope.isSaved = true;
                console.log("done");
                console.log($scope.user,$scope.isSaved)
            });
        }

    }


// });