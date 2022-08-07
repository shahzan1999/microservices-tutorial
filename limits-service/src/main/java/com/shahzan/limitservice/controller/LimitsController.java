package com.shahzan.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahzan.limitservice.bean.Limits;
import com.shahzan.limitservice.config.Configuration;

@RestController 
public class LimitsController {

	@Autowired
	private Configuration configurations;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configurations.getMinimum(), configurations.getMaximum());
	}
	
}
