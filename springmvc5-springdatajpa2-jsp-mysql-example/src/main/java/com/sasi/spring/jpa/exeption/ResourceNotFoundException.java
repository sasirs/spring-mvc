/**
 * @author sasi
 *
 */
package com.sasi.spring.jpa.exeption;

/**
 * 
 */
public class ResourceNotFoundException extends Exception{

	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public ResourceNotFoundException(Object resourId) {
	        super(resourId != null ? resourId.toString() : null);
	    }
}
