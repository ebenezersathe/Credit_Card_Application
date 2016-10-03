/*
 *Defining the home controller for the home.html where the 
 *$scope is the glue between application controller and the view.
 */
app.controller('homeController', [ '$scope', '$http', function($scope, $http) {
	/**
	 * Rest service URL to get the registered user list. As of now ajax get
	 * operation is been kept in the same file because of the minimal
	 * requirement but can move to the factory to make the code more redeable.
	 */
	var url = "rest/register";
	$scope.myData = [];
	$http.get(url).success(function(response) {
		/**
		 * Below line is used to map the data to the angular UI grid.
		 */
		$scope.gridOptions.data = response;
	});
	/**
	 * The below function is been used to defined the column of the UI grid.
	 */
	$scope.gridOptions = {
		enableSorting : true,
		columnDefs : [ {
			name : 'Name',
			field : 'name'
		}, {
			name : 'Address',
			field : 'address'
		}, {
			name : 'DOB',
			field : 'dob'
		}, {
			name : 'SSN',
			field : 'ssn'
		}, {
			name : 'Annual Income',
			field : 'annualIncome'
		} ]
	};
} ]);