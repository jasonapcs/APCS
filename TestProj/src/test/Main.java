package test;

import java.io.*;

public class Main {
	
	static String MainString;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	/*
	 * NEW LINE WILL BE PRINTED
	 * TEXT MUST NOT HAVE TERMINATING NEWLINE
	 */
	public static void getInputToMainString(String text) throws IOException {
		System.out.print("\n" + text);
		MainString = reader.readLine();
	}
}
