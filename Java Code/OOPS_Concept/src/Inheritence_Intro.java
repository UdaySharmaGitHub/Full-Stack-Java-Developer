       //---------- Inheritence introduction--------//
// creating a drived class
class Base_class{
	 public int x;  // publically defined
//		using the getter and setter
	public void set_valX(int x) {
		this.x=x;
	}
	public int get_valX() {
		return x;
	}
	public void print() {
		System.out.println("I am in Base class");
	}
}
class Drived_class extends Base_class{
	public int y;    // publically defined
//	using the getter and setter
	public void set_valY(int y) {
		this.y=y;
	}
	public int get_valY() {
		return y;
	}
	public void print() {
		System.out.println("I am in Drived class");
	}
}
public class Inheritence_Intro {
	public static void main(String[] args) {
//		creating a object of the base class
		Base_class b1=new Base_class();
		b1.set_valX(465);
		System.out.println("the value of the a is :"+b1.get_valX());
		b1.print();
//		creating a object of the derived class
		Drived_class d1=new Drived_class();
		d1.set_valY(123);
		System.out.println("the value of the a is :"+d1.get_valY());
		d1.print();
	}
}
