package com.onesoft.day08052023;

public class StringindexoutofboundExe {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			String a="gowri";
			System.out.println(a.charAt(7));
		}
		catch(StringIndexOutOfBoundsException sib) {
			sib.printStackTrace();
		}
		System.out.println("end");
	}

}
