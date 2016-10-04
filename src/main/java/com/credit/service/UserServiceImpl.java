/**
 * 
 */
package com.credit.service;

import java.util.List;

import com.credit.dao.UserDAO;
import com.credit.dao.UserDAOImpl;
import com.credit.model.RegisteredCustomer;

/**
 * @author Ebenezer
 *
 */
public class UserServiceImpl implements UserService{
	UserDAO dao=new UserDAOImpl();

	@Override
	public List<RegisteredCustomer> getResgisteredCustomer() {
		return dao.getResgisteredCustomer();
	}

	@Override
	public void saveDetails(RegisteredCustomer registeredCustomer) {
		dao.saveDetails(registeredCustomer);
		
	}

}
