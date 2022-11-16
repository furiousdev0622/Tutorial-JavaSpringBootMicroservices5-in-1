package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyExchangeProxy proxy;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
	    @PathVariable String from, @PathVariable String to,
	    @PathVariable BigDecimal quantity) {

	HashMap<String, String> uriVariables = new HashMap<>();
	uriVariables.put("from", from);
	uriVariables.put("to", to);

	ResponseEntity<CurrencyExchange> responseEntity = new RestTemplate()
		.getForEntity(
			"http://localhost:8000/currency-exchange/from/{from}/to/{to}",
			CurrencyExchange.class, uriVariables);

	CurrencyExchange currencyExchange = responseEntity.getBody();

	return new CurrencyConversion(currencyExchange.getId(), from, to,
		quantity, currencyExchange.getConversionMultiple(),
		quantity.multiply(currencyExchange.getConversionMultiple()),
		currencyExchange.getEnvironment() + " rest template");
    }

    @GetMapping("/currency-conversion-02/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionNotUseCurrencyExchangeEntity(
	    @PathVariable String from, @PathVariable String to,
	    @PathVariable BigDecimal quantity) {

	HashMap<String, String> uriVariables = new HashMap<>();
	uriVariables.put("from", from);
	uriVariables.put("to", to);

	ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate()
		.getForEntity(
			"http://localhost:8000/currency-exchange/from/{from}/to/{to}",
			CurrencyConversion.class, uriVariables);

	CurrencyConversion currencyConversion = responseEntity.getBody();

	return new CurrencyConversion(currencyConversion.getId(), from, to,
		quantity, currencyConversion.getConversionMultiple(),
		quantity.multiply(currencyConversion.getConversionMultiple()),
		currencyConversion.getEnvironment()
			+ " rest template (use CurrencyConversion Entity to receive CurrencyExchange return)");
    }

    @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionFeign(
	    @PathVariable String from, @PathVariable String to,
	    @PathVariable BigDecimal quantity) {

	CurrencyExchange currencyExchange = proxy.retrieveExchangeValue(from,
		to);

	return new CurrencyConversion(currencyExchange.getId(), from, to,
		quantity, currencyExchange.getConversionMultiple(),
		quantity.multiply(currencyExchange.getConversionMultiple()),
		currencyExchange.getEnvironment() + " feign");
    }

    @GetMapping("/currency-conversion-feign-02/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversionFeignNotUseCurrencyExchangeEntity(
	    @PathVariable String from, @PathVariable String to,
	    @PathVariable BigDecimal quantity) {

	CurrencyConversion currencyConversion = proxy
		.retrieveExchangeValue02(from, to);

	return new CurrencyConversion(currencyConversion.getId(), from, to,
		quantity, currencyConversion.getConversionMultiple(),
		quantity.multiply(currencyConversion.getConversionMultiple()),
		currencyConversion.getEnvironment()
			+ " feign (use CurrencyConversion Entity to receive CurrencyExchange return)");
    }

}
