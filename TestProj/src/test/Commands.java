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
					+ "\'exit\' command syntax is : exit <ExitCode>\n");
		}
	}	
}
