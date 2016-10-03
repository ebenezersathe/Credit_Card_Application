var app = angular.module('app', [ 'ngRoute', 'ngTouch', 'ui.grid',
		'ui.grid.autoResize' ]);

app.config(function($routeProvider) {
	$routeProvider

	.when('/', {
		templateUrl : 'home.html',
		controller : 'homeController'
	})

	.when('/register', {
		templateUrl : 'registrationPage.html',
		controller : 'registrationController'
	})

	.otherwise({
		redirectTo : '/'
	});
});

app.controller('homeController', [ '$scope', function($scope) {

	$scope.myData = [ {
		"firstName" : "Cox",
		"lastName" : "Carney",
		"company" : "Enormo",
		"employed" : true
	}, {
		"firstName" : "Lorraine",
		"lastName" : "Wise",
		"company" : "Comveyer",
		"employed" : false
	}, {
		"firstName" : "Nancy",
		"lastName" : "Waters",
		"company" : "Fuelton",
		"employed" : false
	} ];
} ]);

app.controller('registrationController', [ '$scope', function($scope) {

	$scope.data = 'saurabh';
} ]);