package com.onesoft.day08052023;

public class ExceptionExe {
	public static void main(String[] args) {
		System.out.println("program start");
		try {//Where we expect exception
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
		}
		catch(ArithmeticException ae){//to handle the exception
			ae.printStackTrace();//to print the exception line
			// System.err.println("Don't give divided by zero");//err is given to print the line in red color
		}
		System.out.println("program done");
	}

}
