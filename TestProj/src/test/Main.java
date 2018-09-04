package test;

import java.io.*;

/*
 * Main class
 */
public class Main {
	
	static Command allCommands[] = { new exitCommand(), new echoCommand(), new manCommand() };
	
	static String InputString;
	static String[] InputStringArray;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	static int tempint;
	
	public static void main(String[] args) {
		System.out.println("CONSOLE TESTING ENVIRONMENT\n"
				+ "Year: 2018; By: JASON ZHANG");
		
		for(;;) {    // Main program loop
			try {
				getInputToInputString(">>>");
				InputStringArray = InputString.split(" ");
				
				/*
				 * Begins parsing commands
				 * Tests which command in first position of InputStringArray
				 * Then passes control to specialized function 
				 */
				tempint = 1;
				for (Command c : allCommands) {
					if (InputStringArray[0] == c.commandID) {
						c.execute(InputString);
					}
					else if (tempint >= allCommands.length) {
						break;
					}
					else {
						tempint++;
					}
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
