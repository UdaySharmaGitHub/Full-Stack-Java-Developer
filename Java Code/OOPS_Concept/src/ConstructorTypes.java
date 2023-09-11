//  creating a default constructor to call it from the object
class default_constructor{
	default_constructor()
	{
		System.out.println("this is default constructor ! which has no parameteric value");
	}
}
//  creating a parameteric constructor to call it and its show the values
class parameteric_constructor{
	parameteric_constructor(String s,int n)
	{
		System.out.println("this is parameteric constructor ! which has two parameteric value");
	    System.out.println("the string is entered is "+s+" and the integers values is "+n);
	}
}
//        creating a class to show the constructor overloading
class constructor_overloading{
//	this is done by overridding the method by different no of argument return 
	constructor_overloading(String s)   // one argument 
	{
		System.out.println("this is parameteric constructor ! which has two parameteric value");
	    System.out.println("the string is entered is "+s);
	}
	constructor_overloading(String s,int n)        // two argument 
	{
		System.out.println("this is parameteric constructor ! which has two parameteric value");
	    System.out.println("the string is entered is "+s+"the integers value is "+n);
	}
	constructor_overloading(String s,int n,float number) // three argument
	{
		System.out.println("this is parameteric constructor ! which has two parameteric value");
	    System.out.println("the string is entered is "+s+"the integers value is "+n+" and the salary is "+number);
	}
}
public class ConstructorTypes {
	public static void main(String[] args) {
//		creating a default constructor object to call it 
		default_constructor obj=new default_constructor();	
//		creating a parameteric constructor object to access it using the arguments
		parameteric_constructor obj1=new parameteric_constructor("uday sharma",12);
//		creating a object of the class of the constructor overloading
		constructor_overloading obj2=new constructor_overloading("uday sharma");
		constructor_overloading obj3=new constructor_overloading("uday sharma",46);
		constructor_overloading obj4=new constructor_overloading("uday sharma",43,123.456f);

	}
}
