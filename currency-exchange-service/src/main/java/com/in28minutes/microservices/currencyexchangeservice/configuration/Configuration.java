package com.in28minutes.microservices.currencyexchangeservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

//    private int minimum;
//    private int maximum;
//
//    public int getMaximum() {
//	return maximum;
//    }
//
//    public void setMaximum(int maximum) {
//	this.maximum = maximum;
//    }
//
//    public int getMinimum() {
//	return minimum;
//    }
//
//    public void setMinimum(int minimum) {
//	this.minimum = minimum;
//    }

}
