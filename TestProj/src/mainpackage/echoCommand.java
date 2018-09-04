package mainpackage;

public class echoCommand extends Command {
	
	/*
	 * This function executes the command 'echo'
	 * It also handles any exceptions that could occur
	 */
	public void execute(String Input) {
		try {
			String InputArray[] = Input.split(" ", 2);
			System.out.print(InputArray[1]);
			System.out.print("\n");
		}
		catch(Exception e) {
			System.out.print("Error: Syntax\n"
					+ "\'echo\' command syntax is: echo <String>\n");
		}
	}
	
	public String commandID = "echo";
}
