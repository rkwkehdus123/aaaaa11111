package org.huggies.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HuggiesController {
	
	
	@RequestMapping(value = "member/join", method = RequestMethod.GET)
	public void join() {
	}
	@RequestMapping(value = "member/login", method = RequestMethod.GET)
	public void login() {
	}
	
}
