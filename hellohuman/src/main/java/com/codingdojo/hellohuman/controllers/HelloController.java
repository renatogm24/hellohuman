package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	/*@RequestMapping("/")
	public String helloHuman() {
		return "Hello human ";
	}*/

	@RequestMapping("/")
	public String hello(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "lastname", required = false) String lastname, @RequestParam(value = "times", required = false) Integer times) {
		String nameTxt = "";
		if (name != null) {
			nameTxt += name +" ";
		}
		if (lastname != null) {
			nameTxt += lastname;
		}
		
		if(times == null) {
			times = 1;
		}
		
		if ( nameTxt == "") {
			return ("Hello human").repeat(times);
		} else {
			return ("Hello " + nameTxt).repeat(times);
		}
	}
}
