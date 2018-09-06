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
	
	public static void main(String[] args) throws IOException {
		System.out.println("CONSOLE TESTING ENVIRONMENT\n");
		
		for(;;) {    // Main program loop
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
					allCommands[0].execute(InputString);
					break;
					
				case "echo":
					allCommands[1].execute(InputString);
					break;
					
				case "man":
					allCommands[2].execute(InputString);
					break;
					
				default:
					System.out.print("Unrecognized command: \'" + 
				InputStringArray[0] + "\'\nTry using 'man' to get commands\n");
					break;
				}
				
			}
			catch(Exception e) {
				System.out.print("ERROR: Unhandled exception thrown\n");
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
