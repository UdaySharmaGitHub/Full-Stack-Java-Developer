package basic_java;
import java.util.Scanner;
public class Recursion {
    static int sum(int n) {
	if (n==0)
		return 0;
	else 
	return (n+sum(n-1));// this methods is recursive approach
	}
     static int fact(int n) {
   	if (n==0|| n==1)
   		return 1;
   	else 
  		return (n*fact(n-1));// this methods is recursive approach
    		}
     static int fib(int n1) {
        if (n1==0)
        		return 0;
        else if(n1==1|| n1==2)
    		 return 1;
    	 else
    		 return (fib(n1-1)+fib(n1-2));
     }
public static void main(String[] args) {
		// recursion in java using method
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number for which you want factorial and summation :");
          int a=sc.nextInt(); // taking the number from the user
          System.out.println("the factorial and the summation of the given number is "+sum(a)+","+fact(a));
          while(true) {
          System.out.println("enter the index for which you want the fibonacci number :");
          int a1=sc.nextInt();
          System.out.println("the number is "+fib(a1));
          }
	}
}
