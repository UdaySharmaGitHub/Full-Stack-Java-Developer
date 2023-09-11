         // Java Inner Class Intro
public class Inner_Class_Intro {
	// Declaring the access modifiers
     public int age=19;
     private String name="Uday Sharma";
    // Creating a inner class 
     public class Inner_Class1{
    	 void print_info(){
   System.out.println("the name is "+name+" and the age is "+age);
    	 }
     }
	public static void main(String[] args) {
		// creating a object of the outer class		
		Inner_Class_Intro outerObj=new Inner_Class_Intro();
		// creating an object of the inner class 
		Inner_Class_Intro.Inner_Class1 innerObj=outerObj.new Inner_Class1();
		// accessing the inner method using the object 
		innerObj.print_info();
	}
}
