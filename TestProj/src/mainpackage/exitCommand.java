package mainpackage;

public class exitCommand extends Command {
	
	/*
	 * This function execute the command 'exit'
	 * It also handles exceptions from execution code
	 */
	public void execute(String Input) {
		int temp;
		try {
			String InputArray[] = Input.split(" ");
			temp = Integer.parseInt(InputArray[1]);
			System.exit(temp);
		}
		catch(Exception e) {
			System.out.print("Error: Syntax\n"
					+ "\'exit\' command syntax is: exit <ExitCode>\n");
		}
	}
	
	public String commandID = "exit";
}
