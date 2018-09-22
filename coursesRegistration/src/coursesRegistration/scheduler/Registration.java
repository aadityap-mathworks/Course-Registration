package coursesRegistration.scheduler;

/**
 * @author Aaditya Sakharam Patil
 * Provides Structure to store Regitrstion details
 */
public class Registration {
	String studentName;
	String course1, course2, course3;
	int time1, time2, time3;
	
	/**
	 * getters and setters
	 *
	 */
	public int getTime1() {
		return time1;
	}
	public void setTime1(int time1) {
		this.time1 = time1;
	}
	public int getTime2() {
		return time2;
	}
	public void setTime2(int time2) {
		this.time2 = time2;
	}
	public int getTime3() {
		return time3;
	}
	public void setTime3(int time3) {
		this.time3 = time3;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	public String getCourse3() {
		return course3;
	}
	public void setCourse3(String course3) {
		this.course3 = course3;
	}
	

}
