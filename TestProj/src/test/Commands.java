package test;


/*
 * A convenient way to store commands
 */
public class Commands {
	
	/*
	 * This function execute the command 'man'
	 * It also handles exceptions from execution code
	 */
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
	 * It also handles any exceptions that could occur
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
	
	
	/*
	 * This function executes the command 'man'
	 * It also handles exceptions that could occur
	 * Possible candidate for splitting apart
	 */
	public static void manCommand() {
		int temp;
		try {
			Main.InputStringArray = Main.InputString.split(" ", 2);
			try {
				temp = Integer.parseInt(Main.InputStringArray[1]);
				
				// KEEP THIS ORGANIZED ALPHABETICALLY
				switch (temp) {
				case 1:
					System.out.print("\'echo\'  : echo <String>\n");
					System.out.print("\'exit\'  : exit <ExitCode>\n");
					System.out.print("\'man\'   : man <page> | man <command>\n");
					break;
					
				default:
					System.out.print("Unrecognized Page " + temp + ", please try again\n");
					break;
				}
			}
			catch(Exception e) {
				switch(Main.InputStringArray[1]) {
				case "exit":
					System.out.print("\'exit\' command syntax is: exit <ExitCode>\n");
					break;
					
				case "echo":
					System.out.print("\'echo\' command syntax is: echo <String>\n");
					break;
					
				case "man":
					System.out.print("\'man\' command syntax is: man <page> | man <command>\n");
					break;
					
				default: System.out.print("Unrecognized Command " + Main.InputStringArray[1] +
						", please try again\n");
				}
			}
		}
		catch(Exception e) {
			System.out.print("Error: Syntax\n"
					+ "\'man\' command syntax is: man <page> | man <command>\n");
		}
	}
}
