package labs;

/*
 * Create a Student Database with the following attributes:
 * 	--New Student constructor that takes name and SSN in the arguments
 * 	--Automatically create an email ID based on the name
 *  --Set a private static ID
 *  --Generate a user ID that is combination of Static ID, random 4-digit number between 1000
 *  	and 9000, and last 4 of SSN
 *  --Methods: enroll(), pay(), checkBalance(),toString(),showCourses()
 *  --Use encapsulation to set variables(phone, city, state)
 * 
 */
public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("Test1","123456789");
		Student s2 = new Student("Test2","101011123");
		
		s1.setPhone("3232342345");
		s1.setCity("Baltimore");
		s1.setState("Maryland");
		
		s2.setPhone("9797979797");
		s2.setCity("Towson");
		s2.setState("Maryland");
		
		System.out.println(s1.toString());
		s1.enroll();
		s1.pay();
		s1.checkBalance();
		s1.showCourses();
		
		System.out.println(s2.toString());
		s2.enroll();
		s2.pay();
		s2.checkBalance();
		s2.showCourses();
	}
}

 class Student{
	 
	 private static int id = 10;
	 String name;
	 private String SSN;
	 private String emailID;
	 private String userID;
	 private String phone;
	 private String city;
	 private String state;
	 
	 int min = 1000;
	 int max = 9000;
	
	//Parameterized constructor
	public Student(String name,String SSN){
		 this.name = name;
		 this.SSN = SSN;
		 id++;
		 System.out.println("Student ID: "+id);
		 generateEmail(name);
		 createUserID();
	 }
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	private void generateEmail(String name) {
		emailID = name +"@student.email.edu";
		System.out.println("Email ID: "+emailID);
	}
	
	private void createUserID() {
		int random = (int) (Math.random()*(max-min));
		userID = id + random + SSN.substring(5, 9);
		System.out.println("UserID: "+userID);
	}
	
	// Methods: enroll(), pay(), checkBalance(),toString(),showCourses()
	public void enroll() {
		System.out.println("You are enrolled.");
	}
	
	public void pay() {
		System.out.println("Bill is paid.");
	}
	
	public void checkBalance() {
		System.out.println("Checking Balance....");
	}
	
	public void showCourses() {
		System.out.println("List of Courses: ");
		
	}
	
	public String toString() {
		String studentDetail = "[Student Name: "+name+"\n Username: "+userID+"\n Email ID: "+emailID+" SSN: "+SSN+"\n City: "+city+"\n Phone: "+phone+"\n State: "+state;
		System.out.println("--------------------------------------*-----------------------------------------");
		return studentDetail;
	}
}
