package com.credit.services;

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

import org.springframework.web.bind.annotation.RequestMapping;

import com.credit.model.RegisteredCustomer;

@Path("/register")
public class RegistrationService {
	/**
	 * Method use to get the List of the Customer
	 * who are already registered.
	 * 
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRegisteredCustomerList() {
		RegisteredCustomer c1 = new RegisteredCustomer();
		c1.setName("saurabh");
		c1.setAddress("glasgow");
		c1.setDob("25/02/1991");
		c1.setAnnualIncome(10000);
		c1.setSsn(1234);

		RegisteredCustomer c2 = new RegisteredCustomer();
		c2.setName("ebe");
		c2.setAddress("glasgow");
		c2.setDob("25/02/1991");
		c2.setAnnualIncome(10000);
		c2.setSsn(1234);

		List<RegisteredCustomer> list = new ArrayList<RegisteredCustomer>();
		list.add(c1);
		list.add(c2);

		GenericEntity<List<RegisteredCustomer>> entity = new GenericEntity<List<RegisteredCustomer>>(list) {
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

		System.out.println(registeredCustomer);

	}

}
