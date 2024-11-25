/**
 * @author sasi
 *
 */
package com.sasi.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sasi.spring.entity.Customer;

/**
 * 
 */

@Repository
public class CustomerDAOImpl  implements CustomerDAO{

//	@Autowired
//    private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
//		Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.saveOrUpdate(theCustomer);
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
