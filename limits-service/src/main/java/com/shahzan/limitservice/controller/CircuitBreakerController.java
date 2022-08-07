package com.shahzan.limitservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	@Retry(name="sample-api", fallbackMethod = "fallBack")
//	@CircuitBreaker(name="sample-api", fallbackMethod = "fallBack")
//	@RateLimiter(name="default")
//	@Bulkhead(name="default")
	public String sampleAPI() {
		
		logger.info("Tried api********************************************************");
		int a=1;
		if(a==1)
			throw new RuntimeException();
		
		return "Sample API";
	}
	
	public String fallBack(Exception e) {
		return "fallback";
	}
	
}
