import java.util.Scanner;
public class Varargs {
	// denoting the vararge keyword using (int ...array_name)
  static int sum(int ...arr) {
	  //Avaible as int[] arr;
	  int result=0;
	  for(int a:arr){
		  result+=a;
	  }
	  return result;
  }
	public static void main(String[] args) {
		int sum_a=0;
		// using the function name sum(...arr)
		System.out.println("the sum of 4,5,6 :"+sum(4,5,6));
		Scanner sc=new Scanner(System.in);
		int[] a=new int[100]; //decalsring a array 
		System.out.println("enter the size of the array :");
		int size=sc.nextInt(); // taking the size from the user
		for(int i=0;i<size ;i++) {
			System.out.print("enter the "+(i+1)+" element in the array :");
			a[i]=sc.nextInt(); // taking the user input element
			}
		for(int i=0;i<size;i++) {
		sum_a+=a[i]; // getting the sum of the user given array
			System.out.print(a[i]+" ");
		}
		System.out.println("\n the sum of the array : "+sum_a);  
		// getting the sum using vararge function 
		System.out.println("the sum os the array using the vargs :"+sum(a));
	}

}
