//         Creating an Abstract class
abstract class STATionary{
//	 creating a constructor of the abstract class 
	STATionary(String name){
        System.out.println("the STATionary can give you a pen "+name);		
	}
//   creating a public method
	public void company() {
		System.out.println("Select the company of the pen");
	}
//	creating an abstract method
	abstract void companyname(String PenCompany); 
}
//      creating a derived class PENSTATionary from STATionary
class PENSTATionary extends STATionary{	
//	creating a constructor of the derived class
       PENSTATionary(String name,String types) {
//    	   using super() keyword to access the above abstract class constructor
		super(name);
     System.out.println("the name of the pen is "+name+" and the types of the pen is "+types);
     }
//      creating a derived class public method
	public void companyname(String PenCompany) {
    	   System.out.println("the company of the pen is "+PenCompany);
	}
}
public class Abstract_Class_constructor {
	public static void main(String[] args) {
//		dynamic binding upcasting 
        STATionary st1=new PENSTATionary("Cello","Ball pen");
        st1.company();
        st1.companyname("CELLO");
	}}
