/*
 *Defining the registration controller for the registrationPage.html where the 
 *$scope is the glue between application controller and the view.
 */
app.controller('registrationController', [
		'$scope',
		'$http',
		function($scope, $http) {
			/**
			 * The below is function is called on the page load to attached the
			 * datepicker to the html element.
			 */
			/*$(function() {
				$('#dob').datetimepicker({
					format : 'DD/MM/YYYY'
				});
			});*/
			
			/**
			 * Function will be called to save the data to database.
			 * 
			 */
			$scope.saveData = function() {
				//S$scope.user.dob=
				/**
				 * Below url with the type as post used to save the data to the
				 * database.
				 */
				var url = "rest/register";
				/**
				 * As of now keeping the ajax call in the same file than can be
				 * moved to the factory.
				 */
				$http.post(url, JSON.stringify($scope.user)).success(
						function(response) {
						});
			}
		} ]);