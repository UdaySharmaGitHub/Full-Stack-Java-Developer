// using the Throws Keyword in java
import java.io.IOException;
// Creating a class which contains method which is throws Exception
	class Throws_Exception_in_Java{
	// Throwing a Checked Exception method in the class
	public void Checked_Exception() throws IOException{
		throw new IOException("Exception in the checked throw statment ");
	}
	// Passing the Exception into another throws Exception method
	public void n() throws IOException{
		Checked_Exception();
	}
	// Calling that Throwed-method in the another method within the try catch block
	public void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Exceeption in the catch block");
		}
		finally {
			System.out.println("This is the final block ");
		}
	}
	// Declaration Exception as throws in the ,method
	public void Decalared_Exception() throws IOException{
		System.out.println("this is the Decalared Exception method Which Throws the Error in the run time");
	}
	}
public class Throws_Keywprd_Exception {
	public static void main(String[] args) throws IOException {
		// calling the method by making the object
		Throws_Exception_in_Java obj=new Throws_Exception_in_Java();
		obj.p();
		System.out.println("rest of the code-1 ");
		// Calling the method using the object in the try-catch block
		try {
			obj.Checked_Exception();
		}catch(Exception e) {  System.out.println("Exception handled");
		}
		finally{
			System.out.println("The rest of the code ");
		}
// If Exception does not occurs because we take the Throw Exception Method without contain throw keyword
		obj.Decalared_Exception();
// If Exception occurs because we take the Throw Exception Method with contain throw keyword
		obj.Checked_Exception();
		System.out.println("The rest of the code");
	}
}
