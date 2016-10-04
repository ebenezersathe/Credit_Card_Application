package com.credit.rest;

/**
 * The service is used to get the data of the 
 * customer who are already registered and also 
 * to save the details of the newly registered customer.
 * 
 */
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




import com.credit.model.RegisteredCustomer;
import com.credit.service.UserService;
import com.credit.service.UserServiceImpl;

@Path("/register")
public class RegistrationService {
	
	UserService service=new UserServiceImpl();
	/**
	 * Method use to get the List of the Customer
	 * who are already registered.
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegisteredCustomerList() {
		GenericEntity<List<RegisteredCustomer>> entity = new GenericEntity<List<RegisteredCustomer>>(service.getResgisteredCustomer()) {
		};
		return Response.ok(entity).build();
	}
	/**
	 * Method used to save the details of the customer.
	 * @param registeredCustomer
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void saveRegisteredCustomer(RegisteredCustomer registeredCustomer) {
		service.saveDetails(registeredCustomer);
	}

}
