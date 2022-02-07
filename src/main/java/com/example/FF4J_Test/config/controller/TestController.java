package com.example.FF4J_Test.config.controller;

import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	@Autowired
	public FF4j ff4j;
	public void get() {
		System.out.println("I am Rad Test Controller......s");
		System.out.println(ff4j.getFeatures());
	}
}
