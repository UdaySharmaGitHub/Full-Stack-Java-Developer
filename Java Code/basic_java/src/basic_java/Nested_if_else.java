package basic_java;
import java.util.Scanner;
public class Nested_if_else {
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   // this is an example of nested if-else
while(true) {
   System.out.print("Enter your weight : " );
   float weight=sc.nextFloat();
   System.out.print("Enter your gym_fee_budget per month : " );
   float fee=sc.nextFloat();
   System.out.print("Enter how many months you want to train : " );
 int month=sc.nextInt();
 if(weight>=60 && weight<=70) {
	 System.out.print("you need to lose weight ");
	 if(fee>=1200) {
		 if(month>=1) {
			 float cost=month*fee;
			 System.out.println("you total gym plan cost you about : "+(cost));  }
		 else {
			 System.out.println("you need to work out at home ");  }
	  }
	 else if(fee<1200){
		 System.out.println("you don't get a personal trainee");   }
    }
 else if(weight>70){
	 System.out.println("you need to work hard and go for different plan ");  }
 else {
	 System.out.println("you are under weight");  }
}
}
}
