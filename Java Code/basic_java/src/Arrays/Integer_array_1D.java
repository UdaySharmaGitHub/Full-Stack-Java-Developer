package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Integer_array_1D {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter the size of the array : ");
      int n =sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
        	 System.out.print("enter the "+(i+1)+" element in the array : ");
          arr[i]=sc.nextInt();         }
         for(int i=0;i<n;i++) {
        	 System.out.print(arr[i]+" "); }
         System.out.println();
         Arrays.sort(arr);
         System.out.println("the sorted array is : ");
         for(int i=0;i<n;i++) {
        	 System.out.print(arr[i]+" "); }
	}
}


