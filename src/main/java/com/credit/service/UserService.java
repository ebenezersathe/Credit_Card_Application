/**
 * 
 */
package com.credit.service;

import java.util.List;

import com.credit.model.RegisteredCustomer;

/**
 * @author Ebenezer
 *
 */
public interface UserService {
	
	public List<RegisteredCustomer> getResgisteredCustomer();
	public void saveDetails(RegisteredCustomer registeredCustomer);

}
