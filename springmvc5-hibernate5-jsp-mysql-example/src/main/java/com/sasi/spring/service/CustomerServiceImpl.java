/**
 * @author sasi
 *
 */
package com.sasi.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasi.spring.dao.CustomerDAO;
import com.sasi.spring.entity.Customer;

/**
 * 
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
    private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);	
	}

	@Override
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
	}

}
