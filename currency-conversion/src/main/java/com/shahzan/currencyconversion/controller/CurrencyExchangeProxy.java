package com.shahzan.currencyconversion.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shahzan.currencyconversion.bean.CurrencyConversion;

//@FeignClient(name="limits-service",url="localhost:8080")
@FeignClient(name="limits-service")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from,@PathVariable String to);	
	
}
