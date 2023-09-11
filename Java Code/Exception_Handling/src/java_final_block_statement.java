     // Using a finally statement 
public class java_final_block_statement {
	public static void main(String[] args) {
	// using nested Try-Catch block in java 	
try {
		// Arithmetic Exception 
try {  // Creating a try block
	System.out.println("we are in the try-1 block");
	int a=25/0;  // Getting a Arithmetic Error 
	System.out.println(a);
}catch(Exception e1){  // getting an exception  in the catch block
	System.out.println("We are in the catch-1 group ");
	System.out.println(e1);  // printing an exception (e)
	}
        // ArrayIndexOfBound Exception
try {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("we are in the try-2 block "+a[11]);
}catch(Exception e2) {
	System.out.println("we are in the catch-2 group of Array out of bound index");
	System.out.println(e2);
}
    // NUllPointerException
try {
	String name1=null;
	System.out.println("The lenght of the String : "+name1.length());
}catch(Exception e3) {
	System.out.println("the length of the string is : ");
	System.out.println(e3);
}
		}
// Creating a finally statement , // Finally statement always occurs at last 
//    its doesn't matter whether their is exception or not in the code 		
finally {
	System.out.println("finally block is always executed");
}
// rest of the code comment
System.out.println("rest of the code");
	}
}
