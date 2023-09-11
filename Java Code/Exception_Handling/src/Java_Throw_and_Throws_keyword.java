import java.util.*;
class Throw_Throws_Keywords {
	// creating a method which uses the throw keyoword 
	public void even_number(int a) {
		if(a%2==0) {
			System.out.println("The number is divisble by 2 this is even number ");    }
		else {
		throw new ArithmeticException("this is not even number ");   }
       }
	// creating a method which uses the throws keyword
	public int number_divided_by_0(int b) throws ArithmeticException{
		int c=b/0;
		return c;   }
}
public class Java_Throw_and_Throws_keyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Throw_Throws_Keywords obj1=new Throw_Throws_Keywords();
		// checking the throw-Keyword exception
		System.out.println("Enter the number whether its even or odd :");
		int n=sc.nextInt();
		obj1.even_number(n);
		// checking the throws-keyword exception
		System.out.println("Enter the number which dived by the zero :");
		n=sc.nextInt();
		try {
			System.out.println(obj1.number_divided_by_0(n));
		}catch(Exception e) {
			System.out.println("this cannot be divided by the zero : "+e);}
		finally {
			System.out.println("the rest of the code : ");   }
	}
}
