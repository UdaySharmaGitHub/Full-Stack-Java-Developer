package basic_java;
import java.util.Scanner;
public class TwoDimensialarray {

	public static void main(String[] args) {
		// 2-D Array
				/*
				 // initsilization of 2-d array
				int[][] mat1= {{1,2,3,4},{5,6,7,8}};
				int[][] mat2=new int[2][4];
				mat2[0][0]=456;
				System.out.println(mat2[0][0]);
				System.out.println("the matrices is :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		*/
//				summation of 2-D array using initialization
				int[][] mat3=new int[2][4];
				int[][] mat1= {{1,2,3,4},{5,6,7,8}};
				int[][] mat2= {{8,7,6,5},{4,3,2,1}};
				System.out.println("the matrices mat1 is :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
			}
		System.out.println("the matrices mat2 is :");
		for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
		System.out.print(mat2[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("the sum of  matrices mat1+mat2=mat3 is :");
		for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
			mat3[i][j]=mat1[i][j]+mat2[i][j];
		System.out.print(mat3[i][j]+" ");
		}
		System.out.println();
		}
		              // 2-d user given input array
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the row size of the array :");
		 int m=s.nextInt();  
		 System.out.println("enter the colume size of the array :");
		 int n=s.nextInt();
		 int[][] arr=new int[m][n];
		 System.out.println("enter the element in the array :");
		 for(int i=0;i<m;i++){
			 for(int j=0;j<n;j++){
				 System.out.println("enter the ("+i+","+j+") element in the array :");
		            arr[i][j]=s.nextInt();		 
			 }
		 }
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
			 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
			 }
	}

}
