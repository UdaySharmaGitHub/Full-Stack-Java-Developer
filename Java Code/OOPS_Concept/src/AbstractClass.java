//     creating a abstract class and its method 
//  abstract class is that class which is helpus to make other class
//  and we cannot make an object of the abstract class
abstract class BAse2{
	public void hello() {
		System.out.println("hi how are you ");
	}
	public void BAse2()
	{	
		System.out.println("hi i am constructor of abstract bsae2 class ");
	}
	abstract void greet1();
	abstract void greet2();
}
//           make a derived class from the abstract class to access
class DErived2 extends BAse2{
//	overriding the methods in class which is derived from the abstract class
	@Override
	public void greet1() {
		System.out.println("this is the abstract method of abstract class ");
	}
	@Override
	public void greet2() {
		System.out.println("which is overide using the override method calls in the derivde class ");
	}
}
class ChildofDErived2 extends DErived2{
	public void method() { 
		System.out.println("this is derived class of the derived2 class");
	}
}
//creating an abstract derived class of the abstract class of BAse2
abstract class ChildofBAse2 extends BAse2{
	public void method2() { 
		System.out.println("this is derived abstract class of the BAse2 class");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
//		we cannot create an object of the base class
		//		Base2 b1=new Base2();  //-->ERROR NOT POSSIBLE   
//creating of an object of the derived class which is inherited with abstract class
		ChildofDErived2 c1 =new ChildofDErived2();
		c1.hello();
		c1.BAse2();
		c1.greet1();
		c1.greet2();
//		we cannot access the derived abstract class which is derived from the abstract class
//		ChildofBAse2 CB1=new ChildofBAse2(); //-->ERROR NOT POSSIBLE
	}
}
