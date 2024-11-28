/**
 * @author sasi
 *
 */
package com.sasi.springboot.springboot2_webapp_jsp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "user")
public class User {
	 @Id 
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    private String name;
	 
	    public User()
	    {
	    }

	    public User(Integer id, String name)
	    {
	        this.id = id;
	        this.name = name;
	    }

	    public Integer getId()
	    {  
	        return id;
	    }

	    public void setId(Integer id)
	    {
	        this.id = id;
	    }

	    public String getName()
	    {
	        return name;
	    }

	    public void setName(String name)
	    {
	        this.name = name;
	    }
}
