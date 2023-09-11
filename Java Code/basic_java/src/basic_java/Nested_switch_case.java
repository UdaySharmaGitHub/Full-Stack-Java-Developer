package basic_java;
import java.util.Scanner;
// this is example of nested switch statement
public class Nested_switch_case {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your branch :" );
    String branch=sc.nextLine();
   System.out.println("Enter your year in COER(College) in numeric :" );
   int year=sc.nextInt();
switch(year){	
	case 1:
		switch(branch) {
		case "IT":
			System.out.println("your exam of "+branch+" of "+year+" is in feb");
			break;
     	case "CSE":
		    System.out.println("your exam of "+branch+" of "+year+" is in jan");
		    break;
	}
		break;
	case 2:
		switch(branch) {
		case "IT":
			System.out.println("your exam of "+branch+" of "+year+" is in june");
			break;
		case "CSE":
		    System.out.println("your exam of "+branch+" of "+year+" is in july");
		    break;
	}
		break;
	case 3:
		switch(branch) {
		case "IT":
			System.out.println("your exam of "+branch+" of "+year+" is in jan");
			break;
     	case "CSE":
		    System.out.println("your exam of "+branch+" of "+year+" is in feb");
		    break;
	}
		break;
	case 4:
		switch(branch) {
		case "IT":
			System.out.println("your exam of "+branch+" of "+year+" is in june");
			break;
     	case "CSE":
		    System.out.println("your exam of "+branch+" of "+year+" is in june");
		    break;
	}
  default:
	  System.out.println("invalid year :");
	  break;
}
}}
