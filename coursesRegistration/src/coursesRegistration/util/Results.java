
package coursesRegistration.util;

/**
 * @author Aaditya Sakharam Patil
 *
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import coursesRegistration.scheduler.Registration;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	
	//Structure to store final result
	public static ArrayList<Registration> finalList = new ArrayList<Registration>();
	
	/**
	 * method to store results
	 *
	 */
	public void finalResult(Registration res)
	{
		finalList.add(res);
	}
	
	/**
	 * method to write results to output file
	 *
	 */
	public void writeToFile() 
	{
		File out=null;
		FileWriter fw = null;
		
		try {
			 
			out= new File("/home/aadya/Desktop/csx42-f18-assign-1--apatil19/coursesRegistration/src/registration_results.txt");
			fw = new FileWriter(out);
			for(int a=0; a< finalList.size(); a++)
			{
				fw.write(finalList.get(a).getStudentName()+" : ");
				if(finalList.get(a).getCourse1()!=null)
				{
					fw.write(finalList.get(a).getCourse1());
				}
				if(finalList.get(a).getCourse2()!=null)
				{
					fw.write(", "+finalList.get(a).getCourse2());
				}
				if(finalList.get(a).getCourse3()!=null)
				{
					fw.write(", "+finalList.get(a).getCourse3());
				}
				fw.write("\n");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				
				fw.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
	
	/**
	 * method to display results on StdOut
	 *
	 */
	public void displayStdOut() {
		for(int a=0; a< finalList.size(); a++)
		{
			System.out.print(finalList.get(a).getStudentName()+" : ");
			if(finalList.get(a).getCourse1()!=null)
			{
				System.out.print(finalList.get(a).getCourse1());
			}
			if(finalList.get(a).getCourse2()!=null)
			{
				System.out.print(", "+finalList.get(a).getCourse2());
			}
			if(finalList.get(a).getCourse3()!=null)
			{
				System.out.print(", "+finalList.get(a).getCourse3());
			}
			System.out.println();
		}
	}
	
	
	
}
