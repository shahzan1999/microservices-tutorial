package com.shahzan.limitservice.bean;

public class CurrencyExchange {

	private Long id;
	private String from;
	private String to;
	private Integer conversionMultiple;
	private String environment;
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public CurrencyExchange(Long id, String from, String to, Integer conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public CurrencyExchange() {
		super();
	}
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public Integer getConversionMultiple() {
		return conversionMultiple;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setConversionMultiple(Integer conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	
	
}
