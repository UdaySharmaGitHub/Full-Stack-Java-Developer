        // Showing java Exception propagation 
// Means Exception Drop down from the top of the stack to the bottom until it caught
import java.io.*;
public class Java_Exception_prpagation {
	// making a function which gives the error
	 public void Arithmatic_Exception() {
		// Arithmetic Exception 
		int a=90,b=0;
		int data=a/b;
	}
	 // ArrayIndexOfBoundException
	public void ArrayIndexOfBound(){
		int a[]= {1,2,3,4,6,7,8,9};
		System.out.println(a[11]);
	}
	// NullPointerException
	public void NullPointer() {
		String name1=null;
		System.out.println(name1.length());
	}
	// passing that function into the lower function of the stack 
	public void method2() {
		Arithmatic_Exception();
		ArrayIndexOfBound();
		NullPointer();
	}
	public void m() throws IOException {
		throw new java.io.IOException("device error");
	}
	// passing into another function in the down of the stack
	// to caught the error
	void method3() {
//		using try-catch 
		try {
			method2();
		}catch(Exception e) {  //catching the error 
			System.out.println("Exception Handled-1 "+e);   }
		try {
			ArrayIndexOfBound();
		}catch(Exception e) { // catching the error
		     System.out.println("Exception Handled-2 "+e);  }                                        
	    try {	
	    	NullPointer();
	    }catch(Exception e) {  // catching the error
	    	System.out.println("Exception Handled-3 "+e);   }
	    try {
	    	m();
	    }catch(Exception e) {
	    	System.out.println(" Throws Exception Catch here");
	    }
	    // using the finally statement 
	    finally {
	    	System.out.println("this is the finally block in ");
	    }
	}
	public static void main(String[] args) {
		// creating an object to access the upper function which is not static 
		Java_Exception_prpagation obj=new Java_Exception_prpagation();
		// calling the method having all the error cantained method in the try-catch block
		obj.method3();
		System.out.println("The rest of the code :");
	}
}
