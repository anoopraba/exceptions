package com.onesoft.day08052023;

public class FinallyblockExe {
	public static void main(String[] args) {
		System.out.println("program start");
		try {
			String val = null;
			System.out.println(val.toUpperCase());
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} 
		finally {//can't able to write code between catch and finally
			System.out.println("finally block work");
		}
		System.out.println("program end");
	}

}
