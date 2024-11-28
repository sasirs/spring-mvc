/**
 * @author sasi
 *
 */
package com.sasi.spring.xml.service;

	
import java.util.List;

import com.sasi.spring.xml.entity.Customer;

/**
 * 
 */
public interface CustomerService {
	  public List < Customer > getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);
}
