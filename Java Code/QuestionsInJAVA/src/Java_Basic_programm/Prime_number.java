package Java_Basic_programm;
import java.util.*;
public class Prime_number {
	static void Prime(int n) {
		int m=n/2,flag=0;
		if(n==0||n==1) {
			System.out.println("Not Prime number");}
			else {
				for(int i=2;i<=m;i++) {
					if(n%i==0) {
						System.out.println(n+" not a prime number");
						flag=1;
						break;}
				}
				if(flag==0) {
					System.out.println(n+" no is prime");}
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("enter the number you want to check : ");
		int n=sc.nextInt();
		Prime(n);
		}
	  }}
