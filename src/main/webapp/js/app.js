var app = angular.module('app', [ 'ngRoute', 'ngTouch', 'ui.grid',
		'ui.grid.autoResize' ]);
/*
 * configuring router to make the application as a single page application
 * where templateUrl defines the html page
 * and controller defines the angular controller which can be found under js/controller folder.
 */
app.config(function($routeProvider) {
	$routeProvider

	.when('/', {
		templateUrl : 'pages/home.html',
		controller : 'homeController'
	})

	.when('/register', {
		templateUrl : 'pages/registrationPage.html',
		controller : 'registrationController'
	})

	.otherwise({
		redirectTo : '/'
	});
});
