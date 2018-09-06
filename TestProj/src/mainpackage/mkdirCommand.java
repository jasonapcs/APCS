package mainpackage;
import java.io.*;

public class mkdirCommand extends Command {

	public void execute(String Input) {
		String InputArray[] = Input.split(" ", 2);
		try {
			new File(InputArray[0]).mkdirs();
		}
		catch (Exception e){
			System.out.print("Error: Syntax\n"
					+ "\'mkdir\' syntax is: mkdir <path/to/dir>");
		}
	}
	
	String commandID = "mkdir";

}
