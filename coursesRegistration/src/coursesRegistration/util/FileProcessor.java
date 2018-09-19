package coursesRegistration.util;

import coursesRegistration.scheduler.Courses;
import coursesRegistration.scheduler.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {
	
	public static ArrayList<Student> studList = new ArrayList<Student>();
	public static ArrayList<Courses> courseList = new ArrayList<Courses>();
	
	public static void read(String cPrefFile, String cInfoFile)
	{
		try
		{
			//using file reader
			FileReader pref = new FileReader(new File(cPrefFile));
			FileReader info = new FileReader(new File(cInfoFile));
			BufferedReader prefReader = new BufferedReader(pref);
			BufferedReader infoReader = new BufferedReader(info);
			String currentline;
			while ((currentline = prefReader.readLine()) != null) 
				{
				 	Student stDetails = new Student();
					//splitting the input file with spaces
					String part[] = currentline.split("[ ,:;]+");
					
					stDetails.setId(part[0]);
					stDetails.setP1(part[1]);
					stDetails.setP2(part[2]);
					stDetails.setP3(part[3]);
					stDetails.setP4(part[4]);
					stDetails.setP5(part[5]);
					stDetails.setP6(part[6]);
					
					if(part[8].equalsIgnoreCase("FIRST_YEAR"))
					{
						stDetails.setLevel(1);		
					}
					else if(part[8].equalsIgnoreCase("SECOND_YEAR"))
					{
						stDetails.setLevel(2);		
					}
					else if(part[8].equalsIgnoreCase("THIRD_YEAR"))
					{
						stDetails.setLevel(3);		
					}
					else
					{
						System.err.println("Error: Incorrect Student Level.");
						System.exit(0);
					}
					
					studList.add(stDetails);
				}
			
			
			while ((currentline = infoReader.readLine()) != null) 
			{
				
				Courses cDetails = new Courses();
				
				//splitting the input file with spaces
				String part[] = currentline.split("[ ,:;-]+");
			
				cDetails.setcName(part[0]);
				cDetails.setCapacity(Integer.parseInt(part[2]));
				cDetails.setTime(Integer.parseInt(part[4]));
				
				courseList.add(cDetails);
			}
			
			//close buffered reader
			prefReader.close();
			infoReader.close();
		
		}		
		//catch block
		catch (FileNotFoundException ex)
	        {
	            System.out.println("Cannot find the file '");
	            ex.printStackTrace();
	        } 
		catch (IOException ex)
	        {
	            System.out.println("Error occureed while reading the file '");
	            ex.printStackTrace();
	
	        }
	}
	
}