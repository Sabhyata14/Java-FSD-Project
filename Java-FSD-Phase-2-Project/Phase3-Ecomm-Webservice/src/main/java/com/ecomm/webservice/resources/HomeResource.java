package com.ecomm.webservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@RequestMapping("/")
	public String serverUp() {
		return "Server is running on 9090 port";
	}
}
