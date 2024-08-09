package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestApp {
	public TestApp() {
		System.out.println("Constructor TestApp");
	}
	
	public void m1() {
		System.out.println("m1 is here");
	}

}
