//methods in java 
import java.util.Scanner;
public class MethodsinJava {
//	creating a returning the method/function
// static keywords is used to invocation in the object creation
// static keywords is associated with class rather than the object 
static int sum(int a,int b){
	int c=a+b;
	return c;
}
 static int greater(int a,int b) {
	 if(a>b)
		 return a;
	 else if(a==b)
	    return 0;
	 else
		 return b;
 }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of the number : ");
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     System.out.println("the number is "+n1+","+n2);
// creating a class object that invoking in the static function or methods
// creating a class object obj in the class MethodsinJava
     MethodsinJava obj=new MethodsinJava();
     int x=obj.sum(n1, n2);
     int y=obj.greater(n1, n2);
//     passing in the static sum method function
     // this method is used withod using the class object
//     int x=sum(n1,n2);
     System.out.println("the sum of two numeber is :"+x);
//     now check the which number is greater
//     int y=greater(n1,n2);
     System.out.println("the number is greater is :"+y);
	}
}
