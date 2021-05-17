package com.dell.ecomm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/")
	public String ServerInnit() {
		return "Server is initialised on port: 9001";
	}
}
