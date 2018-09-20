package coursesRegistration.scheduler;

import java.util.ArrayList;
import coursesRegistration.util.Results;

public class Allocation {

	public static ArrayList<Results> finalList = new ArrayList<Results>();
	
	public static void allocate(ArrayList<Courses> courseList, ArrayList<Student> studList)
	{
		
		for(int i=0 ; i< studList.size(); i++)
		{
			Results res = new Results();
			res.setStudentName(studList.get(i).id);
			
			switch (studList.get(i).p1)
			{
			case "A":
				if(courseList.get(0).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(0).time);
					courseList.get(0).capacity--;
					break;
				}
				else
					break;
			case "B":
				if(courseList.get(1).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(1).time);
					courseList.get(1).capacity--;
					break;
				}
				else
					break;
				
			case "C":
				if(courseList.get(2).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(2).time);
					courseList.get(2).capacity--;
					break;
				}
				else
					break;
				
			case "D":
				if(courseList.get(3).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(3).time);
					courseList.get(3).capacity--;
					break;
				}
				else
					break;
				
			case "E":
				if(courseList.get(4).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(4).time);
					courseList.get(4).capacity--;
					break;
				}
				else
					break;
				
			case "F":
				if(courseList.get(5).capacity>0)
				{
					res.setCourse1(studList.get(i).p1);
					res.setTime1(courseList.get(5).time);
					courseList.get(5).capacity--;
					break;
				}
				else
					break;	
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			
			
			//*****************************************************************************
			//*****************************************************************************
			switch (studList.get(i).p2)
			{
			case "A":
				
				if(res.getCourse1()!=null && courseList.get(0).capacity>0)
				{
					
					if(res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(0).time);
						courseList.get(0).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(0).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(0).time);
						courseList.get(0).capacity--;
					}
					else
						break;
				}
				break;
			case "B":
				if(res.getCourse1()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(1).time);
						courseList.get(1).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(1).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(1).time);
						courseList.get(1).capacity--;
					}
					else
						break;
				}
				break;
				
			case "C":
				if(res.getCourse1()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(2).time);
						courseList.get(2).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(2).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(2).time);
						courseList.get(2).capacity--;
					}
					else
						break;
				}
				break;
				
			case "D":
				if(res.getCourse1()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(3).time);
						courseList.get(3).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(3).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(3).time);
						courseList.get(3).capacity--;
					}
					else
						break;
				}
				break;
				
			case "E":
				if(res.getCourse1()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(4).time);
						courseList.get(4).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(4).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(4).time);
						courseList.get(4).capacity--;
					}
					else
						break;
				}
				break;
			case "F":

				if(res.getCourse1()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse2(studList.get(i).p2);
						res.setTime2(courseList.get(5).time);
						courseList.get(5).capacity--;
					}
					else
						break;
				}
				else 
				{
					if(courseList.get(5).capacity>0)
					{			
						res.setCourse1(studList.get(i).p2);
						res.setTime1(courseList.get(5).time);
						courseList.get(5).capacity--;
					}
					else
						break;
				}
				break;
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			
			
			
			
			//*****************************************************************************
			//*****************************************************************************
			switch (studList.get(i).p3)
			{
			case "A":
				if(res.getCourse2()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime2()!=courseList.get(0).time && res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(0).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(0).time);
					courseList.get(0).capacity--;
					break;
				}
				else
					break;
			case "B":
				if(res.getCourse2()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime2()!=courseList.get(1).time && res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(1).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(1).time);
					courseList.get(1).capacity--;
					break;
				}
				else
					break;
				
			case "C":
				if(res.getCourse2()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime2()!=courseList.get(2).time && res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(2).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(2).time);
					courseList.get(2).capacity--;
					break;
				}
				else
					break;
			case "D":
				if(res.getCourse2()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime2()!=courseList.get(3).time && res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(3).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(3).time);
					courseList.get(3).capacity--;
					break;
				}
				else
					break;
				
			case "E":
				if(res.getCourse2()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime2()!=courseList.get(4).time && res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(4).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(4).time);
					courseList.get(4).capacity--;
					break;
				}
				else
					break;
				
			case "F":
				if(res.getCourse2()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime2()!=courseList.get(5).time && res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse3(studList.get(i).p3);
						res.setTime3(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse2(studList.get(i).p3);
						res.setTime2(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(5).capacity>0)
				{			
					res.setCourse1(studList.get(i).p3);
					res.setTime1(courseList.get(5).time);
					courseList.get(5).capacity--;
					break;
				}
				else
					break;
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			

			
			//*****************************************************************************
			//*****************************************************************************
			switch (studList.get(i).p4)
			{
			case "A":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime2()!=courseList.get(0).time && res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(0).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(0).time);
					courseList.get(0).capacity--;
					break;
				}
				else
					break;
			case "B":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime2()!=courseList.get(1).time && res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(1).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(1).time);
					courseList.get(1).capacity--;
					break;
				}
				else
					break;
				
			case "C":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime2()!=courseList.get(2).time && res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(2).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(2).time);
					courseList.get(2).capacity--;
					break;
				}
				else
					break;
			case "D":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime2()!=courseList.get(3).time && res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(3).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(3).time);
					courseList.get(3).capacity--;
					break;
				}
				else
					break;
				
			case "E":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime2()!=courseList.get(4).time && res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(4).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(4).time);
					courseList.get(4).capacity--;
					break;
				}
				else
					break;
				
			case "F":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime2()!=courseList.get(5).time && res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse3(studList.get(i).p4);
						res.setTime3(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse2(studList.get(i).p4);
						res.setTime2(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(5).capacity>0)
				{			
					res.setCourse1(studList.get(i).p4);
					res.setTime1(courseList.get(5).time);
					courseList.get(5).capacity--;
					break;
				}
				else
					break;
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			
			
			

			
			//*****************************************************************************
			//*****************************************************************************
			switch (studList.get(i).p5)
			{
			case "A":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime2()!=courseList.get(0).time && res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(0).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(0).time);
					courseList.get(0).capacity--;
					break;
				}
				else
					break;
			case "B":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime2()!=courseList.get(1).time && res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(1).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(1).time);
					courseList.get(1).capacity--;
					break;
				}
				else
					break;
				
			case "C":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime2()!=courseList.get(2).time && res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(2).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(2).time);
					courseList.get(2).capacity--;
					break;
				}
				else
					break;
			case "D":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime2()!=courseList.get(3).time && res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(3).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(3).time);
					courseList.get(3).capacity--;
					break;
				}
				else
					break;
				
			case "E":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime2()!=courseList.get(4).time && res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(4).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(4).time);
					courseList.get(4).capacity--;
					break;
				}
				else
					break;
				
			case "F":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime2()!=courseList.get(5).time && res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse3(studList.get(i).p5);
						res.setTime3(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse2(studList.get(i).p5);
						res.setTime2(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(5).capacity>0)
				{			
					res.setCourse1(studList.get(i).p5);
					res.setTime1(courseList.get(5).time);
					courseList.get(5).capacity--;
					break;
				}
				else
					break;
			
			default: 
				System.out.println("invalid course");
				break;
			
			}
			

			
			//*****************************************************************************
			//*****************************************************************************
			switch (studList.get(i).p6)
			{
			case "A":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime2()!=courseList.get(0).time && res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(0).capacity>0)
				{
					if(res.getTime1()!=courseList.get(0).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(0).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(0).time);
					courseList.get(0).capacity--;
					break;
				}
				else
					break;
			case "B":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime2()!=courseList.get(1).time && res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(1).capacity>0)
				{
					if(res.getTime1()!=courseList.get(1).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(1).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(1).time);
					courseList.get(1).capacity--;
					break;
				}
				else
					break;
				
			case "C":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime2()!=courseList.get(2).time && res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(2).capacity>0)
				{
					if(res.getTime1()!=courseList.get(2).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(2).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(2).time);
					courseList.get(2).capacity--;
					break;
				}
				else
					break;
			case "D":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime2()!=courseList.get(3).time && res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(3).capacity>0)
				{
					if(res.getTime1()!=courseList.get(3).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(3).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(3).time);
					courseList.get(3).capacity--;
					break;
				}
				else
					break;
				
			case "E":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime2()!=courseList.get(4).time && res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(4).capacity>0)
				{
					if(res.getTime1()!=courseList.get(4).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(4).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(4).time);
					courseList.get(4).capacity--;
					break;
				}
				else
					break;
				
			case "F":
				if(res.getCourse3()!=null)
				{
					break;
				}
				if(res.getCourse2()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime2()!=courseList.get(5).time && res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse3(studList.get(i).p6);
						res.setTime3(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(res.getCourse1()!=null && courseList.get(5).capacity>0)
				{
					if(res.getTime1()!=courseList.get(5).time)
					{			
						res.setCourse2(studList.get(i).p6);
						res.setTime2(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else
						break;
				}
				else if(courseList.get(5).capacity>0)
				{			
					res.setCourse1(studList.get(i).p6);
					res.setTime1(courseList.get(5).time);
					courseList.get(5).capacity--;
					break;
				}
				else
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
