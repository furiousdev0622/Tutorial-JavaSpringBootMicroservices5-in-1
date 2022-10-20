package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
	this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
	return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HellowWorldBean helloWorldBean() {
	return new HellowWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HellowWorldBean helloWorldPathVariable(@PathVariable String name) {
	return new HellowWorldBean(String.format("Hello World %s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized() {
	Locale locale = LocaleContextHolder.getLocale();
	return messageSource.getMessage("good.morning.message", null,
		"Default Message", locale);
	// return "Hello World V2";
    }
}
