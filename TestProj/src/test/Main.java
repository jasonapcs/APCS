package test;

import java.io.*;

public class Main {
	
	static String InputString;
	static String[] InputStringArray;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) {
		System.out.println("CONSOLE TESTING ENVIRONMENT\n"
				+ "Year: 2018; By: JASON ZHANG");
		
		for(;;) {
			try {
				getInputToInputString(">>>");
				InputStringArray = InputString.split(" ");
				
				switch(InputString) {
					
				}
				}
			catch(Exception e) {
				System.out.print("ERROR, Exception thrown\n");
			}
		}
	}
	
	/*
	 * NEW LINE WILL BE PRINTED AFTERWARDS
	 * TEXT MUST NOT HAVE TERMINATING NEWLINE
	 */
	public static void getInputToInputString(String text) throws IOException {
		System.out.print(text);
		InputString = reader.readLine();
		System.out.print("\n");
	}
}
