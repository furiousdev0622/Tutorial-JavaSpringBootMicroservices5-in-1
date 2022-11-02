package com.in28minutes.microservices.limitsservice.bean;

public class Limits {
    private int minumum;
    private int maximum;

    public int getMinumum() {
	return minumum;
    }

    public void setMinumum(int minumum) {
	this.minumum = minumum;
    }

    public int getMaximum() {
	return maximum;
    }

    public void setMaximum(int maximum) {
	this.maximum = maximum;
    }

    public Limits(int minumum, int maximum) {
	super();
	this.minumum = minumum;
	this.maximum = maximum;
    }

    @Override
    public String toString() {
	return "Limits [minumum=" + minumum + ", maximum=" + maximum + "]";
    }

}
