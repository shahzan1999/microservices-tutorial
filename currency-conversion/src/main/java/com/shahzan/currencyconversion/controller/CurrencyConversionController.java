package com.shahzan.currencyconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shahzan.currencyconversion.bean.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateConversion(@PathVariable String from,@PathVariable String to,
			@PathVariable Integer quantity) {
	
		CurrencyConversion currencyConversion = proxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversion(currencyConversion.getId(), currencyConversion.getFrom(), 
				currencyConversion.getTo(), currencyConversion.getConversionMultiple(), 
				currencyConversion.getEnvironment(),
				quantity,
				quantity*currencyConversion.getConversionMultiple());
	}
	
	
}
