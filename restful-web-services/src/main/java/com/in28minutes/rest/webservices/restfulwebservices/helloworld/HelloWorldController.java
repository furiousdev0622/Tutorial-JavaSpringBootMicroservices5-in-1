package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

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
}
