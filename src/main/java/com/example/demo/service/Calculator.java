package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author nag-devops
 *
 */
@Service
public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

}