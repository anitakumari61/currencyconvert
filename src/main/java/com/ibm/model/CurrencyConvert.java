package com.ibm.model;

import java.util.UUID;


public class CurrencyConvert {
	
	private UUID id;
	private String countryCode;
	private double conversionFactor;
	private double amount;
	private double convertedAmount;
	public CurrencyConvert(UUID id, String countryCode, double conversionFactor, double amount,
			double convertedAmount) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
		this.amount = amount;
		this.convertedAmount = convertedAmount;
	}
	public CurrencyConvert() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getConvertedAmount() {
		return convertedAmount;
	}
	public void setConverrtedAmount(double convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	@Override
	public String toString() {
		return "ConvertedModel [id=" + id + ", countryCode=" + countryCode + ", conversionFactor=" + conversionFactor
				+ ", amount=" + amount + ", convertedAmount=" + convertedAmount + "]";
	}

}
