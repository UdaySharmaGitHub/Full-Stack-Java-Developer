import java.io.*;
         // Throwing a user defined exception 
class UserDefinedException extends Exception{
	 public UserDefinedException(String str)  
	    {  
	        // Calling constructor of parent Exception  
	        super(str);  
	    }  
	}  
public class throw_in_Exception_handling {
	// throwing the unchecked exception 
	public static void validate(int age) {
		if(age<18) {
			// Throwing the exception as person is not eligible for vote
			throw new ArithmeticException("person is not eligible to vote");   }
		else {  System.out.println("person is eligible to vote!!");    }
	}
	// Throwing the checked exception 
	public static void Reading_a_file() throws FileNotFoundException { 
		FileReader myfile=new FileReader("C:\\Users\\Arnav\\Desktop\\abc.txt");
		// passing through the bufferedReader to read the file
		BufferedReader fileinput=new BufferedReader(myfile);
		// throwing the file not found the exception 
		throw new FileNotFoundException();
		
	}
	public static void main(String[] args) {
		     // running and throwing the  unchecked Exception 
//		giving the value to the Static Function 
         validate(13);
         System.out.println("the rest of the code ");
         
         //      Running and throwing the checked Exception
         try{            // calling the method and getting the error
        	 Reading_a_file();
         }catch(FileNotFoundException e) {
        	 e.printStackTrace();
         }
         
         // Throwing the user defined function 
         try  
         {  
             // throw an object of user defined exception  
             throw new UserDefinedException("This is user-defined exception");  
         }  
         catch (UserDefinedException ude)  
         {  
             System.out.println("Caught the exception");  
             // Print the message from MyException object  
             System.out.println(ude.getMessage());  
         }  
         System.out.println("rest of the code");
	}
}
