/**
 * @author sasi
 *
 */
package com.sasi.spring.jpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sasi.spring.jpa.entity.Customer;
import com.sasi.spring.jpa.exeption.ResourceNotFoundException;
import com.sasi.spring.jpa.service.CustomerService;

/**
 * 
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

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
	public String save(@Valid @ModelAttribute("customer") Customer cusomer, BindingResult theBindingResult,Model theModel) {

		if (!theBindingResult.hasErrors()) {
			customerService.saveCustomer(cusomer);
			return "redirect:/customer/list";
		} else {
			theModel.addAttribute("customer", cusomer);
			return "customer-form";
		}

	}

	@GetMapping("/update")
	public String update(@RequestParam("customerId") int id, Model theModel) throws ResourceNotFoundException {
		Customer theCustomer = customerService.getCustomer(id);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
}
