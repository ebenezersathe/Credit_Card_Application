/**
 * 
 */
package com.credit.dao;

import java.util.List;

import com.credit.model.RegisteredCustomer;

/**
 * @author Ebenezer
 *
 */
public interface UserDAO {
	
	public List<RegisteredCustomer> getResgisteredCustomer();
	public void saveDetails(RegisteredCustomer registeredCustomer);

}
