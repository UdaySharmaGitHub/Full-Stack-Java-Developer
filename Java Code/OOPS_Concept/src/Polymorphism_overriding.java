//    method overriding run time polymorphism
class A1{
	public String a;
	public void name(String a) {
		System.out.println("the name is "+a);
	}
	public void method2() {
		System.out.println("this is method2 of class A1");
	}
}
class B1 extends A1{
	@Override                // we ovride this method 
	public void method2() {
		System.out.println("this is method2 of class B1");
	}
	public void method3() {
		System.out.println("this is method3 of class B1");
	}
}
public class Polymorphism_overriding {
	public static void main(String[] args) {
//         creating an object of class A1
		A1 obj1=new A1();
		obj1.name("uday sharma");
		obj1.method2();
//		creating an object of class B1
		B1 obj2=new B1();
		obj2.method2();
		obj2.method3();
	}
}
