package basic_java;
import java.util.Scanner;
public class inputsvalues {

	public static void main(String[] args) {
	    // taking input value by using the 
			 // import java.util.Scanner class 
		Scanner sc=new Scanner(System.in);
	    System.out.print("you enter your line is :");  
	    // to enter and the read the line we use the sc.nextLine() function
	    String line=sc.nextLine();
	      System.out.println("you entered your line is :"+line);
	      System.out.print("enter your age : ");
	 	 // this sc.nextInt()function used to takes interger values
		 int age=sc.nextInt();
		 System.out.println("you entered your age is :"+age);
		 System.out.print("you enter your income is :");
		 // this sc.nextFloat()function used to takes floating point values
			float income=sc.nextFloat();
			 System.out.println("you entered your income is : "+income);
			 // this sc.next()function only takes a sentence
			 System.out.print("enter your name :");
			 String name=sc.next();
	      System.out.println("you entered your name is :"+name);
	}

}
