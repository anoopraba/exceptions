package com.onesoft.day08052023;

public class ArrayIndexoutodboundExe {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			int [] a= {10,20,30,40,50};
			for(int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
		System.out.println("end");
	}

}
