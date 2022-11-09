package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversationMultiple;
    private BigDecimal totalCalculateAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to,
	    BigDecimal quantity, BigDecimal conversationMultiple,
	    BigDecimal totalCalculateAmount, String environment) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversationMultiple = conversationMultiple;
	this.quantity = quantity;
	this.totalCalculateAmount = totalCalculateAmount;
	this.environment = environment;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getFrom() {
	return from;
    }

    public void setFrom(String from) {
	this.from = from;
    }

    public String getTo() {
	return to;
    }

    public void setTo(String to) {
	this.to = to;
    }

    public BigDecimal getConversationMultiple() {
	return conversationMultiple;
    }

    public void setConversationMultiple(BigDecimal conversationMultiple) {
	this.conversationMultiple = conversationMultiple;
    }

    public BigDecimal getQuantity() {
	return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
    }

    public BigDecimal getTotalCalculateAmount() {
	return totalCalculateAmount;
    }

    public void setTotalCalculateAmount(BigDecimal totalCalculateAmount) {
	this.totalCalculateAmount = totalCalculateAmount;
    }

    public String getEnvironment() {
	return environment;
    }

    public void setEnvironment(String environment) {
	this.environment = environment;
    }

    @Override
    public String toString() {
	return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to
		+ ", conversationMultiple=" + conversationMultiple
		+ ", quantity=" + quantity + ", totalCalculateAmount="
		+ totalCalculateAmount + ", environment=" + environment + "]";
    }

}
