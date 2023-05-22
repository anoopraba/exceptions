package com.onesoft.day08052023;

public class StackoverflowError {
	public static void methodA() {
		methodB();
	}
	public static void methodB() {
		methodA();
	}

}
