/**
 * @author sasi
 *
 */
package com.sasi.springboot.springboot2_webapp_jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sasi.springboot.springboot2_webapp_jsp.repository.UserRepository;

/**
 * 
 */

@Controller

public class UserController {

	@Autowired
	UserRepository userRepo;

	@RequestMapping("/users")
	public String home(Model model) {
		model.addAttribute("users", userRepo.findAll());
		return "users";
	}
}
