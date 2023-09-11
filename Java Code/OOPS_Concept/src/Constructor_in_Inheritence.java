//    Constructor in Inheritence
class Base_class1{
//	doing constructor ovelloading of base class
	Base_class1(){  // Default constructor
		System.out.println("this is base class constructor :");
	}
	Base_class1(int x){  // parameteric constructor
		System.out.println("this is an overload constructor of base class "+x);
	}
}
//       creating a derived class from the base class
class Derived_class1 extends Base_class1{
//	doing constructor ovelloading of base class
	Derived_class1(){  // Default constructor
		System.out.println("this is Derived class constructor :");
	}
	Derived_class1(int x,int y){  // parameteric constructor
		// go to the Base_class1 constructor and provids the value
		super(x);
		System.out.println("this is an overload constructor of Derived  class "+x+","+y);
	}
}
// creating a derived class nmae ChildofDerived_class1 of Derived_class1
class ChildofDerived_class1 extends Derived_class1{
//	doing constructor ovelloading of base class
	ChildofDerived_class1(){  // Default constructor
		System.out.println("this is ChildofDerived class constructor :");
	}
	ChildofDerived_class1(int x,int y,int z){  // parameteric constructor
		// go to the Derived_class1 constructor and provids the value
		super(x,y);   
		System.out.println("this is an overload constructor of Child of Derived  class "+x+","+y+","+z);
	}
}
public class Constructor_in_Inheritence {
	public static void main(String[] args) {
//		this runs firstly Base class constructor exceute than the derived class constructor
//             Base_class1 b1=new Base_class1();
//             Derived_class1 d1=new Derived_class1();
//             ChildofDerived_class1 c1=new ChildofDerived_class1();
//		to Create a sequedce we use the super() keyword
//		super() Keyword is used to interconnect with each other with values
		 ChildofDerived_class1 c1=new ChildofDerived_class1();
      ChildofDerived_class1 c2=new ChildofDerived_class1(45,56,23); 
	}
}
