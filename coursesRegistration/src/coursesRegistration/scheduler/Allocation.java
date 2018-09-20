package coursesRegistration.scheduler;

import java.util.ArrayList;

import coursesRegistration.util.Results;

public class Allocation {

	public static ArrayList<Results> finalList = new ArrayList<Results>();
	
	public static void allocate(ArrayList<Courses> courseList, ArrayList<Student> studList)
	{
		
		
		
//		for(int i=0 ; i< courseList.size(); i++)
//		{
//			System.out.println(courseList.get(i).capacity);
//		}
		
		for(int i=0 ; i< studList.size(); i++)
		{
			Results res = new Results();
			
			res.setStudentName(studList.get(i).id);
//			System.out.println(studList.get(i).p1);
			switch (studList.get(i).p1)
			{
			case "A":
				res.setCourse1(studList.get(i).p1);
				break;
			case "B":
				res.setCourse1(studList.get(i).p1);
				break;
				
			case "C":
				res.setCourse1(studList.get(i).p1);
				break;
				
			case "D":
				res.setCourse1(studList.get(i).p1);
				break;
				
			case "E":
				res.setCourse1(studList.get(i).p1);
				break;
				
			case "F":
				res.setCourse1(studList.get(i).p1);
				break;	
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			
			switch (studList.get(i).p2)
			{
			case "A":
				res.setCourse2(studList.get(i).p2);
				break;
			case "B":
				res.setCourse2(studList.get(i).p2);
				break;
				
			case "C":
				res.setCourse2(studList.get(i).p2);
				break;
				
			case "D":
				res.setCourse2(studList.get(i).p2);
				break;
				
			case "E":
				res.setCourse2(studList.get(i).p2);
				break;
				
			case "F":
				res.setCourse2(studList.get(i).p2);
				break;	
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			switch (studList.get(i).p3)
			{
			case "A":
				res.setCourse3(studList.get(i).p3);
				break;
			case "B":
				res.setCourse3(studList.get(i).p3);
				break;
				
			case "C":
				res.setCourse3(studList.get(i).p3);
				break;
				
			case "D":
				res.setCourse3(studList.get(i).p3);
				break;
				
			case "E":
				res.setCourse3(studList.get(i).p3);
				break;
				
			case "F":
				res.setCourse3(studList.get(i).p3);
				break;	
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			finalList.add(res);
		}
		
		
		for(int a=0; a< finalList.size(); a++)
		{
			System.out.println(finalList.get(a).getStudentName()+" "+finalList.get(a).getCourse1()+" "+finalList.get(a).getCourse2()+" "+finalList.get(a).getCourse3());
		}
		
	}
	
}
