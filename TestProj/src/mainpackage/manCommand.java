package mainpackage;

public class manCommand extends Command {
	
	/*
	 * This function executes the command 'man'
	 * It also handles exceptions that could occur
	 * Possible candidate for splitting apart
	 */
	public void execute(String Input) {
		int temp;
		String InputArray[];
		try {
			InputArray = Input.split(" ", 2);
			try {
				temp = Integer.parseInt(InputArray[1]);
				
				// KEEP THIS ORGANIZED ALPHABETICALLY
				switch (temp) {
				case 1:
					System.out.print("\'echo\'  : echo <String>\n");
					System.out.print("\'exit\'  : exit <ExitCode>\n");
					System.out.print("\'man\'   : man <page> | man <command>\n");
					System.out.print("\'mkdir\' : mkdir <path/to/dir>\n");
					break;
					
				default:
					System.out.print("Unrecognized Page " + temp + ", please try again\n");
					break;
				}
			}
			catch(Exception e) {
				switch(InputArray[1]) {
				case "exit":
					System.out.print("\'exit\' command syntax is: exit <ExitCode>\n");
					break;
					
				case "echo":
					System.out.print("\'echo\' command syntax is: echo <String>\n");
					break;
					
				case "man":
					System.out.print("\'man\' command syntax is: man <page> | man <command>\n");
					break;
					
				case "mkdir":
					System.out.print("\'mkdir\' command syntax is: mkdir <path/to/dir>");
					break;
					
				default: System.out.print("Unrecognized Command " + InputArray[1] +
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
