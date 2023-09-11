package Java_Basic_programm;
import java.util.Scanner;
public class Prime_no_btw_two_numbers {
	static boolean Prime(int n) {
		 if (n <= 1) {  return false;  }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  return false;  }  
	       }  
	       return true;  
	   }  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the start and end numbers you want to print prime number : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
	     System.out.println("List of prime numbers between " + n + " and " + m);  
		for(int i=n;i<=m;i++) {
			if(Prime(i)) {
				System.out.print(i+" ");
				count++;
		}
	}
		System.out.println("\nthe total number of prime number is "+count);
}
}
