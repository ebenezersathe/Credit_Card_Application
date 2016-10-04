describe('Controllers', function () {

    describe('Messaging Controller', function () {

        var Controller, $httpBackend, $scope, $rootScope, $location, $route;

        beforeEach(module('messagingControllers'));

        beforeEach(inject(function ($injector) {
            var $controller = $injector.get('$controller');
            $httpBackend = $injector.get('$httpBackend');
            $route.current = {$$route: {controller: 'messagingControllers'}};

            $scope = $rootScope.$new();

            Controller = $controller('messagingControllers', {
                '$scope': $scope,
              
                '$http': $injector.get('$http'),
                
            });
        }));

        

        it('should get user details details', function () {
            $httpBackend.expect('GET', '/rest/register').respond(200, {data: {name: 'test', address: 'address', dob: '12/15/1989', ssn: '1234', annualIncome: '2000'}});
            $httpBackend.when('POST', '/rest/register').respond(500, {});

            $httpBackend.flush();
        });

        
});

});