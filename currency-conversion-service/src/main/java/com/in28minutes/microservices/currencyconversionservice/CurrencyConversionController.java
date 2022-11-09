package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
	    @PathVariable String from, @PathVariable String to,
	    @PathVariable BigDecimal quantity) {
	return new CurrencyConversion(10001L, from, to, quantity,
		BigDecimal.ONE, BigDecimal.ONE, "");
    }

}
