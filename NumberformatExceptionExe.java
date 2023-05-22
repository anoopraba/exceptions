package com.onesoft.day08052023;

public class NumberformatExceptionExe {
	public static void main(String[] args) {
		System.out.println("program start");
		try {
			int a = Integer.parseInt("anoo");
			System.out.println(a);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println("program done");
	}

}
