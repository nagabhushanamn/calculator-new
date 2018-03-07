package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CalcHistory;
import com.example.demo.repository.CalcHistoryRepository;

/**
 * 
 * @author nag-devops
 *
 */
@Service
public class Calculator {

	// @Autowired
	// private CalcHistoryRepository repository;

	public int sum(int a, int b) {
		int result = a + b;
		// CalcHistory history=new CalcHistory();
		// history.setA(a);
		// history.setB(b);
		// history.setResult(result);;
		// repository.save(history);
		return result;
	}

	public int sub(int a, int b) {
		return a - b;
	}

}