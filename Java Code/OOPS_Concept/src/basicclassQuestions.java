import java.util.Scanner;   // Scanner library
import java.lang.Math;     // import math library
class CellPhone{
	public void call(){
		System.out.println("calling the phone");
	}
	public void ring() {
		System.out.println("ringing the phone");
	}
	public void pickup() {
		System.out.println("phone pickup by vasu");
	}
}
class Square{
	int  x;
	public void set_sides(int side) {
		x=side;
	}
	public void dimensions() {
		System.out.println("the area of the square is :"+Math.pow(x, 2));
		System.out.println("the perimetre of the square is :"+4*x);
	}
}
class Rectangle{
	int  x,y;
	public void set_sides(int length,int breath) {
		x=length;
		y=breath;
	}
	public void dimensions() {
		System.out.println("the area of the rectangle is :"+(x*y));
		System.out.println("the perimetre of the rectangle is :"+2*(x+y));
	}
}
class Circle{
	float r;
	public void set_radius(float rad) {
		r=rad;
	}
	public void dimensions() {
		System.out.println("the radius of the circle is : "+Math.PI*Math.pow(r, 2));
	}
}
class GTA{
	String name="franklein";
 public void running() {
	 System.out.println("the "+name+" is running ");
 }
 public void hitting() {
	 System.out.println("the "+name+" is hitting someone");
 }
	public void robbing() {
		System.out.println("the "+name+" is robbing the bank");
	}
}
public class basicclassQuestions {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
//       creating object of class CellPhone 
       CellPhone iphone=new CellPhone();
       iphone.call();
       iphone.ring();
       iphone.pickup();
//        creating a object of class Square
       Square s=new Square();
       System.out.println("enter the side of the square :");
       int x=sc.nextInt();
       s.set_sides(x);
       s.dimensions();
//       creating a object of class Rectangle
       Rectangle r=new Rectangle();
       System.out.println("enter the sides of the rectangle :");
       int l=sc.nextInt();
       int b=sc.nextInt();
       r.set_sides(l,b);
       r.dimensions();
       // creating a object class circle
       Circle c1=new Circle();
       System.out.println("enter the radius of the circle for which you want the dimensions :" );
       float rad=sc.nextFloat();
       c1.set_radius(rad);
       c1.dimensions();
       // creating a object class GTA
       GTA frank=new GTA();
       frank.running();
       frank.hitting();
       frank.robbing();
	}
}
