/**
 * @author sasi
 *
 */
package com.sasi.spring.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sasi.spring.model.HelloWorld;

/**
 * 
 */

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String hanler(Model model) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld);
		return "helloworld"; // jsp page
	}
}
