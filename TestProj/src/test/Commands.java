package test;

import java.io.*;

public class Commands {
	
	public static void exitCommand() {
		int temp;
		try {
			temp = Integer.parseInt(Main.InputStringArray[1]);
			System.exit(temp);
		}
		catch(Exception e) {
			System.out.print("Error: Syntax\n"
					+ "\'exit\' command syntax is: exit <ExitCode>\n");
		}
	}
	
	/*
	 * This function executes the command 'echo'
	 * It also handles any exceptions that 
	 */
	public static void echoCommand() {
		try {
			Main.InputStringArray = Main.InputString.split(" ", 2);
			System.out.print(Main.InputStringArray[1]);
			System.out.print("\n");
		}
		catch(Exception e) {
			System.out.print("Error: Syntax\n"
					+ "\'echo\' command syntax is: echo <String>\n");
		}
	}
}
