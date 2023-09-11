//creating a first class in java
class Employee {         // craeting a class name Employee
	int ID;                // class name is always capital
	String name;
	float salary;
	public void set_val(int n, String a) { // creating public method
		ID = n; // we can access using the object
		name = a;
	}
	public void get_val() { // another public method
		System.out.println("the ID no of the employee is " + ID + " and the name is " + name);
		System.out.println("the salary of the employee is " + sal());
	}
	public float sal() { // another method with the return argument
		return salary;
	}
	public void info(int rollno,int collage_id) {
		System.out.println("the rollno is "+rollno+" and the id is "+collage_id);
	}}
public class JavaClassIntro {
	public static void main(String[] args) {
//		Creating a class object using the new keyword 
		Employee uday = new Employee();
		Employee vat = new Employee();
		uday.salary = 45000.045f;
		uday.set_val(123, "Uday Sharma"); // giving the value of the method
		uday.get_val(); // calling the method
		vat.set_val(124, "vasu tirpathi");
		vat.salary = 1230465.45f;
		vat.get_val();
		// creating a class object using a new Instance() methods
		new Employee().info(125,210210210);
//		creating a Multiple object using clone() method
         Employee anshul=new Employee(),yadav=new Employee();
         anshul.set_val(126, "ANSHUL");
         anshul.salary=55000f;
         yadav.salary=45000f;
         yadav.set_val(127, "YADAV");
         anshul.get_val();
         yadav.get_val();
}}
