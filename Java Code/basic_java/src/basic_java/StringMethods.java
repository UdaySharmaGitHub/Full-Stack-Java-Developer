package basic_java;
import java.util.Scanner;
public class StringMethods {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// string 'new' keyword non-primitive type
		// String concatenate
				String name1 = new String("vday sharma");
				String name2 = "vatsalya tripathi";
				String name3 = name1 + " and " + name2;
				System.out.println(name3);
		//  name1.concat(name2) catenation of string 
				System.out.println(name1.concat(name2));
				// System.out.println(name2==name3); // gives false value beacuse
		// name1.equals(name2)
				// check whether the string are equal or note
				System.out.println(name1.equals(name2));
		// charAt
				// function use to print that charcater present that index
				System.out.println(name3.charAt(6));
		// length()
				// function use to print the length of the character
				System.out.println(name3.length());
		// replace('x' , 'y')
				// use to replace the charcater with another character
				String name4 = name3.replace('v', 'u');
				System.out.print(name4);
				String name5 = new String("abcdefghijklmnpqrstuvwxyz");
				System.out.println(name5);
				System.out.print("enter your string : ");
				String name6 = sc.nextLine();
				System.out.println(name6);
		// toUppercase() 
				// convert all the charcater in upper case formate
				System.out.println(name6.toUpperCase());
		// toLowercase()
				// convert all the charcater in lower case formate
				System.out.println(name6.toLowerCase());
		// substring(user input index)
				// use to print the substring
				// substring() gives a substring after the given index from the end
				System.out.println(name6.substring(2));
		// startsWith()
				// it check the string starts with the given statement
				System.out.println(name6.startsWith("i am "));
		// endsWith()
				// it check the string is end with the given statement
				System.out.println(name6.endsWith(" 19 years old"));
		// charAt()
				// is use to find which character present at the given index
				System.out.println(name6.charAt(6));
		// indexOf()
				// is uses to get the index of that the particular character
				System.out.println(name6.indexOf("r"));
		// trim()
				// gives the new string after removing all the spaces
				System.out.println(name6.trim()+name3);
		// cantain() 
				// its check whether the statment cantain that substring or not
				System.out.println(name6.contains("uday sharma"));
		        String name7=sc.nextLine();
		        String name8=sc.nextLine();
	            System.out.println(name7+" "+name8);
	   // equalsIgnoreCase( )
             // Returns true if two strings are equal, ignoring the 
	         //[ lower and upper case] of characters
	          System.out.println(name7.equalsIgnoreCase(name8));
	   // join( ) 
	          // returns a string joined with a given delimiter.
	          String name9= String.join("-",name7, name8);
	          System.out.println(name9);
	}}
