package com.onesoft.day08052023;

public class NullPointerExceptionExe {
	public static void main(String[] args) {
		System.out.println("program started");
		try {
			String a=null;
			String b="Anoo";
			System.out.println(a.concat(b));
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		System.out.println("program done");
	}

}
