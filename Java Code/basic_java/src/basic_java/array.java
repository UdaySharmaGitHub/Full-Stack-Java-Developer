package basic_java;
import java.util.Arrays;
import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// array initialization
           int[] marks=new int[4];
           marks[0]=456;
           marks[1]=789;
           marks[2]=123;
           marks[3]=342;
          System.out.println(marks[0]);
          System.out.println(marks[1]);
          System.out.println(marks[2]);
          System.out.println(marks[3]);
          System.out.println(marks.length);
          for(int i=0;i<4;i++) {
        	  System.out.print(marks[i]+" ");
          }
          System.out.println();
//          we can sort a list by using sort function
        Arrays.sort(marks);
        System.out.println("the sorted array is : ");
        for(int i=0;i<4;i++) {
      	  System.out.print(marks[i]+" ");
        }
        System.out.println();

        int[] number= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<10;i++) {
        	  System.out.print(number[i]+" ");
          }
        System.out.println();
//        character array
        char[] number2= {'a','b','c'};
        for(int i=0;i<3;i++) {
      	  System.out.print(number2[i]+" ");
        }
        System.out.println();
        // user given input 1-d array 
        int[] n = new int[5];
        for(int i=0;i<5;i++) {
        	System.out.println("enter the "+(i+1)+" element in the array :");
        	n[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++) {
        	  System.out.print(n[i]+" ");
          }
	}
}
