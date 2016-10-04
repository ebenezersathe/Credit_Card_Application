describe('Services', function () {

    describe('Authentication Service', function () {

        var $httpBackend, $scope;

        beforeEach(module('authenticationMessagingServices'));

        beforeEach(inject(function ($injector) {
            $httpBackend = $injector.get('$httpBackend');
            Service = $injector.get('authenticationMessagingServices');
        }));


        it('should initialize the service', function () {
            expect(Service).toBeDefined();
        });

        it('should register the value un the database', function () {
            $httpBackend.expect('POST', 'rest/register').respond(200, {token: 'saved'});

            $scope.getAuthenticated('/rest/register').then(function (res) {
                expect(res.data.token).toBe('saved');
            });

            $httpBackend.flush();
        });

        it('should clear texTboxes', function () {
            $scope.clear = '';
            $scope.reset();
            expect($scope.clear).toEqual('');
        });
    });


});