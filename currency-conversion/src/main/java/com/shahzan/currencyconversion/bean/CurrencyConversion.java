package com.shahzan.currencyconversion.bean;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private Integer conversionMultiple;
	private String environment;

	private Integer quantity;
	private Integer totalCalculatedAmount;

	public CurrencyConversion(Long id, String from, String to, Integer conversionMultiple, String environment,
			Integer quantity, Integer totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public CurrencyConversion() {
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

	public String getEnvironment() {
		return environment;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getTotalCalculatedAmount() {
		return totalCalculatedAmount;
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

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setTotalCalculatedAmount(Integer totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

}
