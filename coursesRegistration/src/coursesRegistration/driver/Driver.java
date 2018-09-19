package coursesRegistration.driver;
import coursesRegistration.util.FileProcessor;

/**
 * @author Aaditya Sakharam Patil
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) 
		{
			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}
		
		FileProcessor.read(args[0], args[1]);
<<<<<<< HEAD
=======
		
		//System.out.println("Hello World! Lets get started with the assignment");
>>>>>>> da272e877f71e42f8fc1d3b0e27771ac9d523418

	}
}
