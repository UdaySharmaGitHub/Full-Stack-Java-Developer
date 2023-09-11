package Arrays;
import java.util.Scanner;
public class Two_D_array {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the size of m in the array a[m][n] : ");
      int m=sc.nextInt();
      System.out.print("enter the size of m in the array a[m][n] : ");
      int n=sc.nextInt();
      int[][] a=new int[m][n];
      System.out.println("Enter the element in the array : ");
      for(int i=0;i<m;i++) {
    	  for(int j=0;j<n;j++) {
    		  System.out.print("enter the a["+i+"]["+j+"]th element in the array :");
    		  a[i][j]=sc.nextInt();
    	  }
      }
      System.out.println("the array is : ");
      for(int i=0;i<m;i++) {
    	  for(int j=0;j<n;j++) {
              System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
}}

