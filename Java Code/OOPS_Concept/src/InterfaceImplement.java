//to implement the interface in the java
//interface is use to overcome the limition of hybrid class in inheritence
// we cannot make the object of the interface class or we cannot define the 
//the function inside of the interface class
//create an interface class name CYcle
import java.util.*;
//creating an interface name CYcle 
interface CYcle{
	public int speedup(int increase);
	public int speeddown(int decrease);
}
//creating another interface class name HORn
interface HORn{
	public void hornblowup();
	public void hornblowdown();
}
//now we combine the both interface class using the keywords "implements" 
// class name1 implements Name2,Name3
class BIKe implements CYcle,HORn{
	int speed=90;
	void setspeed() {
		Scanner sc=new Scanner(System.in);
		System.out.print("input the speed is ");
		int speed=sc.nextInt();
		System.out.println("the input speed is "+speed);
	}
//	checking the speed of the vechicle
	public void checkspeed(int speed) {
	if (speed>110) {
		System.out.println("please slow down a bit");
	}
	else {
		System.out.println("you can go faster ");
	}
	}
//	Expanding and calling the interface CYcle methods
	@Override
//	increasing speed using class method
	public int speedup(int increase) {
		speed=speed+increase;
		System.out.println("your speed now is "+speed);
		return speed;
	}
//	decreasing speed using class method
	@Override
	public int speeddown(int decrease) {
		speed=speed+decrease;
		System.out.println("your speed now is "+speed);
		return speed;
	}
//	expanding and calling the interface HORn methods 
	@Override
	public void hornblowup() {
		System.out.println("there is too much traffic ");	
	}
	@Override
	public void hornblowdown() {
		System.out.println("this is empty twoday ");
	}
}
public class InterfaceImplement {
	public static void main(String[] args) {
		BIKe b1=new BIKe();
      b1.setspeed();
      b1.checkspeed(160);
      b1.speeddown(60);
      b1.speeddown(40);
	}
}
