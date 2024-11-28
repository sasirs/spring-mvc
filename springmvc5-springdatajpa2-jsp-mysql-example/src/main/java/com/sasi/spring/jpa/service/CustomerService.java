/**
 * @author sasi
 *
 */
package com.sasi.spring.jpa.service;

	
import java.util.List;

import com.sasi.spring.jpa.entity.Customer;
import com.sasi.spring.jpa.exeption.ResourceNotFoundException;

/**
 * 
 */
public interface CustomerService {
	  public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId) throws ResourceNotFoundException;

	    public void deleteCustomer(int theId);
}
