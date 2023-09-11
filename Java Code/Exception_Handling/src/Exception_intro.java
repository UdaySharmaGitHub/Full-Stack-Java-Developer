import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
public class Exception_intro {
	public static void main(String[] args) {
//   ArithmeticException
   int a=100,b=0;
   try {
	   int c=a/b;
	   System.out.println("the value of c is :"+c);
   }catch(ArithmeticException e1){   // ArithmeticException
	   System.out.println("We failed to divide. Reason: ");
	   System.out.println(e1);}
//     NullPointerException
String name=null;
try {
	 System.out.println("the length of name is :"+name.length());
}catch(Exception e2){   // NullPointerException
	   System.out.println("We failed to print the length of the string.Reason: ");
	   System.out.println(e2);}
//    ArrayIndexOutOfBoundsException 
  int arr[]= {1,2,3,4,5,6,7,8,9,10};
  try {
		 System.out.println("the 11th element in the array :"+arr[11]);
	}catch(ArrayIndexOutOfBoundsException e3){   // NullPointerException
		   System.out.println("We failed to print the elment.Reason: ");
		   System.out.println(e3);}
//           NumberFormatException 
	String s="Btech-cse";
	int i=Integer.parseInt(s);
	try {
		 System.out.println("converting this variable into digit will cause NumberFormatException:"+i);
	}catch(Exception e4){   // NumberFormatException
		   System.out.println("We failed to run : ");
		   System.out.println(e4);}
//	FileNotFoundException
	PrintWriter pw;  
    try {  
        pw = new PrintWriter("jtp.txt"); //may throw exception   
        pw.println("saved");  
    }  
//providing the checked exception handler  
catch (FileNotFoundException e) {  
        System.out.println(e);  }         
System.out.println("File saved successfully");  
	}
}
