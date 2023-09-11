package basic_java;
import java.util.Scanner;
public class MethodsandFunction {
// use for greeting 
	public static void greet() {
		System.out.println("hello !");
	}
	// printing the name
	public static void name(String name) {
		System.out.println(" your name is "+name);
	}
	// printing sum of two number
	public static void sum(int a,int b) {
		int c= a+b;
		System.out.println("the sum of two number is "+c);
	}
	public static void main(String[] args) {
	// Methods and function
		Scanner sc=new Scanner(System.in);
		greet();
		greet();
		greet();
		System.out.println("enter your name :");
		String name=sc.nextLine();
		name(name);
		System.out.println("enter any two number to get sum :");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
	 sum(n1,n2);
	}

}