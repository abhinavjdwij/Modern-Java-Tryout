package com.abhinavjdwij.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhinavjdwij.poc.entity.Person;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/dummy")
public class DummyController {
	@GetMapping("/helloAllUsers")
	public Flux<Person> helloAllUsers() {
		return null;
	}
}
