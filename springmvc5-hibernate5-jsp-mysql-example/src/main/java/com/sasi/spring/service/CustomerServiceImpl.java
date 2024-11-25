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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
	}

}
