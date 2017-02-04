package com.cloudd.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registry")
public class ClouddRegistryWeb {

	@GetMapping("/get")
	public String getRegister()
	{
		return "Hello belal.";
	}
}
