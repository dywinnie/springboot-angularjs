/**
 * Created by wdy on 2/7/17.
 */
// (function(){
//     'use strict';
    angular
        .module('app')
        .controller('RoleController', RoleController);

    RoleController.$inject = ['$scope','RoleService'];

    function RoleController($scope, RoleService) {

        $scope.headingTitle = "Role List";

        var vm = this;
        vm.role = {};
        $scope.roles=[];

        vm.getAllRoles = getAllRoles;

        $scope.roles=vm.getAllRoles;

        console.log("roles",$scope.roles);
        function getAllRoles (){
            return RoleService.getAllRoles();
        }

    }


// });
