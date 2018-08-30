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
				
				/*
				 * Begins parsing commands
				 * Tests which command in first position of InputStringArray
				 * Then passes control to specialized function 
				 */
				switch(InputStringArray[0]) {
				case "exit":
					Commands.exitCommand();
					break;
					
				case "echo":
					Commands.echoCommand();
					break;
					
				case "man":
					Commands.manCommand();
					break;
					
				default:
					System.out.print("Unrecognized Command: " + InputStringArray[0] + "\n");
					break;
				}
			}
			catch(Exception e) {
				System.out.print("ERROR, Exception thrown\n");
			}
		}
	}
	
	/*
	 * NEW LINE WILL BE PRINTED AFTERWARDS BY USER
	 * TEXT MUST NOT HAVE TERMINATING NEWLINE
	 */
	public static void getInputToInputString(String text) throws IOException {
		System.out.print(text);
		InputString = reader.readLine();
	}
}
