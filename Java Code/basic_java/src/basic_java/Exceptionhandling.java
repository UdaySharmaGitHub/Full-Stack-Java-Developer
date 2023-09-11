package basic_java;

public class Exceptionhandling {

	public static void main(String[] args) {
		 //execptiom handling
		// try-catch in exception handling
		int[] marks= {1,23,45,46,78};
		try{
			System.out.println(marks[8]);
		}catch(Exception exception) {
		 // do something after catching.
		}
		System.out.println("my name is uday sharma");
		}
	}
