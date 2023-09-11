          // Showing Aggregation in java
import java.util.*;
class AReA{
	float  square(float n) {
	return n*n;
	}}
class AREA_cicle01{
	AReA a1;  //aggregation 
	double pi=3.14;
	double area(Float n) {
		a1=new AReA();
		float Rquare=a1.square(n);
				return pi*Rquare;
}}
public class Aggregation_in_java {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AREA_cicle01 c=new AREA_cicle01();
		System.out.println("enter the radius of the circle :");
		Float n=sc.nextFloat();
		double result=c.area(n);
		System.out.println(result);
}}
