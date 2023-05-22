package com.onesoft.day08052023;

public class MailEligibility {
	public static void main(String[] args) throws MailException {
		String val="anoopraba.g1998@yahoo.com";
		if(val.contains("@gmail.com")) {
			System.out.println("eligible mail id");
		} else {
			throw new MailException("not eligible mail id");
		}
		
	}

}
