package basic_java;
import java.util.Scanner;
public class StringArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Starray[]= new String[100];
		System.out.println("Enter the sixe of the String array :");
		int n=sc.nextInt();
	System.out.println("enter the string in the string array:");
	for(int i=0;i<=n;i++) {
			Starray[i]=sc.nextLine();
		}
		for(int i=0;i<=n;i++) {
			System.out.print(Starray[i]+" ");
		}
	}
}
