package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class CalcHistory {

	@Id
	private int id;
	private int a;
	private int b;
	private int result;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
