/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

	
import java.util.List;

import com.sasi.spring.entity.Customer;

/**
 * 
 */
public interface CustomerService {
	  public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);
}
