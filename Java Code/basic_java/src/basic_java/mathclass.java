package basic_java;
public class mathclass {
	public static void main(String[] args) {
		// maths class
        // .random finction print random value in the form of string 
		System.out.println(Math.random());
      // typecasting the random function into int 
		 // only gives zero value so we multple by some number
        System.out.println((int)(Math.random()*100));
		int a[]= {45,23,87,56,99,100,468};
		   // finding the maximum value using .max function
		System.out.println(Math.max(45,546 ));
		  // finding the minimum value using .min funcrtion
		System.out.println(Math.min(456, 12));
		  //  finding the squaroot of number by using the .sqrt function
		System.out.println(Math.sqrt(625));	
		int x=90,y=60;
		//raise to power
        System.out.println("raise to power of x is: " + Math.pow(x, 2));   
		// return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
	}
}
