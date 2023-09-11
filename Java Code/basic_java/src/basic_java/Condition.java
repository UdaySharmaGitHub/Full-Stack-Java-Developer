package basic_java;
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) {
		//condtional statement 
				Scanner sc=new Scanner(System.in);
				System.out.print("enter your age :");
				int age=sc.nextInt();
				System.out.println("you entered your age is : "+age);
				if(age>=18) {
					System.out.println("you can vote ");
				}
				else if(age<18) {
					System.out.println("you canot vote");
				}
				// logical operator 
		          System.out.println("enter any two number :");
		          int n1=sc.nextInt();
		          int n2=sc.nextInt();
		     if(n1==n2) {
		    	 System.out.println("both the value are equal");
		     }
		     else if(n1<50 || n2<50) {
		    	 System.out.println("one of them number is less than 50");
		     }
		     else if(n1>50 && n2>50) {
		    	 System.out.println("both the values is greater than 50 ");
		     }
		     else {
		    	 System.out.println("both the values are unequal");
		     }
	}

}
