package com.dell.ecomm.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String serverUp() {
		return "Server is running on localhost:9000";
	}

	@RequestMapping("/hello")
	public String helloGreeting() {
		return "Hello, welcome to Spring boot Web app";
	}

	@RequestMapping("/hi")
	public String hiGreeting() {
		return "HI, welcome to Spring boot Web app";
	}

	@RequestMapping("/wish")
	public String dayGreetings(@PathParam("name") String name) {
		return "Today is good day! Your greetings (" + name + ")";
	}

	@RequestMapping("/label/{name}")
	public String showLabel(@PathVariable("name") String name) {
		return "Your Label is : ( " + name + " )";
	}

}
