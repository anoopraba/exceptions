package com.onesoft.day08052023;

public class IndexoutofboundExe {
	public static void main(String[] args) {
		System.out.println("start");
		try {
		String a="onesoft";
		System.out.println(a.charAt(8));
		}
		catch(IndexOutOfBoundsException ibe) {
			ibe.printStackTrace();
		}
		System.out.println("end");
	}

}
