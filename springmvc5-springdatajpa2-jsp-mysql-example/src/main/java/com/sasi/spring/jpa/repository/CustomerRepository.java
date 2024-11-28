/**
 * @author sasi
 *
 */
package com.sasi.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.spring.jpa.entity.Customer;


/**
 * 
 */
@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
