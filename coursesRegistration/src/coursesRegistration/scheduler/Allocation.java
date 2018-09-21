package coursesRegistration.scheduler;

import coursesRegistration.util.FileProcessor;
import coursesRegistration.util.Results;

public class Allocation extends FileProcessor{

	
	public static void allocate(String[] details)
	{
			Registration res = new Registration();
			Results r= new Results();
			for(int i =1;i<7;i++)
			{
				res.setStudentName(details[0]);
				
				switch (details[i])
				{
				case "A":
					if(res.getCourse1()==null && courseList.get(0).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(0).time);
						courseList.get(0).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(0).capacity>0)
					{
						if(res.getTime1()!=courseList.get(0).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(0).time);
							courseList.get(0).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(0).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(0).time && res.getTime1()!=courseList.get(0).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(0).time);
							courseList.get(0).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
					
				case "B":
					if(res.getCourse1()==null && courseList.get(1).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(1).time);
						courseList.get(1).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(1).capacity>0)
					{
						if(res.getTime1()!=courseList.get(1).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(1).time);
							courseList.get(1).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(1).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(1).time && res.getTime1()!=courseList.get(1).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(1).time);
							courseList.get(1).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
					
				case "C":
					if(res.getCourse1()==null && courseList.get(2).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(2).time);
						courseList.get(2).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(2).capacity>0)
					{
						if(res.getTime1()!=courseList.get(2).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(2).time);
							courseList.get(2).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(2).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(2).time && res.getTime1()!=courseList.get(2).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(2).time);
							courseList.get(2).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
					
				case "D":
					if(res.getCourse1()==null && courseList.get(3).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(3).time);
						courseList.get(3).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(3).capacity>0)
					{
						if(res.getTime1()!=courseList.get(3).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(3).time);
							courseList.get(3).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(3).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(3).time && res.getTime1()!=courseList.get(3).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(3).time);
							courseList.get(3).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
					
				case "E":
					if(res.getCourse1()==null && courseList.get(4).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(4).time);
						courseList.get(4).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(4).capacity>0)
					{
						if(res.getTime1()!=courseList.get(4).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(4).time);
							courseList.get(4).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(4).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(4).time && res.getTime1()!=courseList.get(4).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(4).time);
							courseList.get(4).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
					
				case "F":
					if(res.getCourse1()==null && courseList.get(5).capacity>0)
					{
						res.setCourse1(details[i]);
						res.setTime1(courseList.get(5).time);
						courseList.get(5).capacity--;
						break;
					}
					else if(res.getCourse2()==null && courseList.get(5).capacity>0)
					{
						if(res.getTime1()!=courseList.get(5).time)
						{			
							res.setCourse2(details[i]);
							res.setTime2(courseList.get(5).time);
							courseList.get(5).capacity--;
							break;
						}
						else
							break;
					}
					else if(res.getCourse3()==null && courseList.get(5).capacity>0) 
					{
						if(res.getTime2()!=courseList.get(5).time && res.getTime1()!=courseList.get(5).time)
						{			
							res.setCourse3(details[i]);
							res.setTime3(courseList.get(5).time);
							courseList.get(5).capacity--;
							break;
						}
						else
							break;
					}
					else
						break;
				
				default: 
					System.out.println("invalid course");
					break;
				
				}
			}
			
			r.finalResult(res);
			
	}

	@Override
	public String toString() {
		return "Allocation [toString()=" + super.toString() + "]";
	}
	
	
	
}
