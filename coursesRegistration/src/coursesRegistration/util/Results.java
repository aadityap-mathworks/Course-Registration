package coursesRegistration.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import coursesRegistration.scheduler.Registration;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	
	public static ArrayList<Registration> finalList = new ArrayList<Registration>();
	
	public void finalResult(Registration res)
	{
		finalList.add(res);
	}
	
	public void writeToFile() 
	{
		File out=null;
		FileWriter fw = null;
		
		try {
			 
			out= new File("/home/aadya/Downloads/aadityaSakharam_patil_assign1/coursesRegistration/src/registration_results.txt");
			fw = new FileWriter(out);
			for(int a=0; a< finalList.size(); a++)
			{
				
				fw.write(finalList.get(a).getStudentName()+" : "
						+finalList.get(a).getCourse1()+", "+finalList.get(a).getCourse2()+", "+finalList.get(a).getCourse3()+"\n");
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

	public void displayStdOut() {
		for(int a=0; a< finalList.size(); a++)
		{
			System.out.println(finalList.get(a).getStudentName()+" : "
					+finalList.get(a).getCourse1()+", "+finalList.get(a).getCourse2()+", "+finalList.get(a).getCourse3());
		}
	}
	
	
	
}
