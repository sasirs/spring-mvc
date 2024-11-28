/**
 * @author sasi
 *
 */
package com.sasi.springboot.springboot2_webapp_jsp.repository;

import com.sasi.springboot.springboot2_webapp_jsp.domain.User;

/**
 * 
 */
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
