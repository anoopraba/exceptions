package com.onesoft.day08052023;

public class VoterEligibility {
	public static void main(String [] args) throws Exception {
		int age=15;
		if(age>=18) {
			System.out.println("eligible for vote");
		} else {
			throw new AgeException("age is not eligible");
		}
	}

}
//custom exception where we will create a exception and handling in it.