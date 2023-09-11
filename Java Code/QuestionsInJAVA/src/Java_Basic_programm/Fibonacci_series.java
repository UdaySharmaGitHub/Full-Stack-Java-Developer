package Java_Basic_programm;
import java.util.Scanner;
public class Fibonacci_series {
	static void fib(int n) {
		int n1=0,n2=1;
	for(int i=0;i<=n;i++) {
		System.out.print(n1+" ");  //0 //1  //1  //2  //3  //8
		int n3=n1+n2; //1  // 2 //3  //5  //8
		n1=n2; //1  // 1  //2  // 3  //5
		n2=n3; //1  //2  //3  //5   //8
	}}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number where you want the fibonacci series : ");
          int n=sc.nextInt();
           fib(n);
	}}
