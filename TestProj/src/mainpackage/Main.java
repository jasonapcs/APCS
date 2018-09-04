package mainpackage;

import java.io.*;

/*
 * Main class
 */
public class Main {
	
	static Command allCommands[] = { new exitCommand(), new echoCommand(), new manCommand() };
	
	static String InputString;
	static String[] InputStringArray;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
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
				for (int i = 0; i <= allCommands.length; i++) {
					if (i == allCommands.length) {
						System.out.print("Unrecognized command: \'" + InputStringArray[0]
								+ "\'\nTry using \'man\' to get commands\n");
						break;
					}
					
					if (InputStringArray[0].equals(allCommands[i].commandID)) {
						allCommands[i].execute(InputString);
						break;
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
