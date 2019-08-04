package oop;

public class Demo {
	
	String name, email, phone;

	public static void main(String[] args) {
		//Attribute, variables, adjective, description
		Demo person1 = new Demo();
		Demo person2 = new Demo();
		/*
		 * Demo person2 = new Demo("Hello","hello@email.com","2345421234");
		 * System.out.println(person1.toString());
		 * System.out.println(person2.toString());
		 */
		System.out.println(person1.toString());
		person2.setName("Dell");
		person2.setEmail("dell@email.com");
		person2.setPhone("983254778529");
		person1.walk(person1.getName());
		
		System.out.println(person2.toString());
		person2.walk(person2.getName());
		
	}
	
 public Demo() {
	 name = "Dummy";
	 email = "abcd@email.com ";
	 phone = "1234567890";
 }
 public Demo(String name, String email, String phone) 
 {
	this.name = name;
	this.email =email;
	this.phone = phone;
 }

 public void setName(String name) {
	 this.name = name;
 }
 
 public void setEmail(String email) {
	 this.email = email;
 }
 public void setPhone(String phone) {
	 this.phone = phone;
 }
 public String getName() {
	 return name;
 }
 public String getEmail() {
	 return email;
 }
 public String getPhone() {
	 return phone;
 }
 
 public void walk(String name) {
	 System.out.println(name+" can walk.");
 }
 public String toString() {
	 String result = "Name is "+name+". His email id is "+email+" and phone number is "+phone+"."; 
	 return result;
 }
 
}
