/**
 * 
 */
package com.credit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.credit.connection.JdbcConnection;
import com.credit.model.RegisteredCustomer;

/**
 * @author Ebenezer
 *
 */
public class UserDAOImpl implements UserDAO {
	JdbcConnection connection = new JdbcConnection();

	/**
	 * 
	 */
	@Override
	public List<RegisteredCustomer> getResgisteredCustomer() {
		List<RegisteredCustomer>  list =new ArrayList<RegisteredCustomer>();
		Connection conn = connection.getConnection();
		 String query = "select * from users";  
		 try{
		 Statement stmt = conn.createStatement();
		 ResultSet rs = stmt.executeQuery(query);
         while (rs.next())
         {
        	 RegisteredCustomer c2 = new RegisteredCustomer();
     		c2.setName(rs.getString(1));
     		c2.setAddress(rs.getString(2));
     		c2.setDob(rs.getDate(3));
     		c2.setAnnualIncome(rs.getDouble(4));
     		c2.setSsn(rs.getInt(5));
     		list.add(c2);
     		
         }
		 }catch(Exception e){
			 
		 }finally{
			 try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("Error in closing connection"
							+ e.getMessage());
				}
		 }
		return list;
	}

	/**
	 * 
	 */
	@Override
	public void saveDetails(RegisteredCustomer registeredCustomer) {
		Connection conn = connection.getConnection();
		try {

			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO Users (Name, Address, DOB,SSN,Annual_Income) VALUES (?, ?, ?,?,?)");
			ps.setString(1, registeredCustomer.getName());
			ps.setString(2, registeredCustomer.getAddress());
			ps.setDate(3, registeredCustomer.getDob());
			ps.setDouble(4, registeredCustomer.getAnnualIncome());
			ps.setInt(5, registeredCustomer.getSsn());

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error in saving Details" + e.getMessage());
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Error in closing connection"
						+ e.getMessage());
			}
		}

	}

}
