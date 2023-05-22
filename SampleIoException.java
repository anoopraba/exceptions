package com.onesoft.day08052023;

import java.io.BufferedReader;
import java.io.File;//ctrl+shift+o to import packages
import java.io.FileReader;
import java.io.IOException;

public class SampleIoException {
	public static void main(String[] args) throws IOException {
		System.out.println("start");
		try {
		File f=new File("D:\\Helo.txt");//used to take a file outside of java and convert into java file
		FileReader fr=new FileReader(f);//used to read the file
		int temp=0;
		while((temp=fr.read())!=-1) {//here -1 refers to no value
			System.out.print((char)(temp));
		}
		}catch(Exception e){
			//e.printStackTrace();
			System.err.println("no file");
		}
		System.out.println("end");
		
	}

}
