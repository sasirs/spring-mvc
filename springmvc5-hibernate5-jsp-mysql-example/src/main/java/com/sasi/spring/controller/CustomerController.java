/**
 * @author sasi
 *
 */
package com.sasi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sasi.spring.entity.Customer;
import com.sasi.spring.service.CustomerService;

/**
 * 
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/show-form")
	public String showForm(Model theModel) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
 	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("customer") Customer cusomer) {
		return "redirect:/customer/list";
	}
	
	@PostMapping("/update")
	public String update(@RequestParam("customerId") int id, Model theModel) {
		return "list-cusomers";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("customerId") int id) {
        return "redirect:/customer/list";
	}
}
