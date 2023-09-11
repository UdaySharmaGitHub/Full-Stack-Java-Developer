public class MethodsOverloading {
   // creating a non-static functions 
//	so we have to call the class object 
   // overloading the sum function with an arguments.
//	Arguments are actual!
 	int sum(int a,int b){   // 2 parameters
		return a+b;
	}
	int sum(int a,int b,int c){ // 3 parameters
		return (a+b+c);
	}
	
	int mul(int a,int b){
		return (a*b);
	}
	int mul(int a,int b,int c) {
		return (a*b*c);
	}
	// by changing the return type ex:- int<=>double
		double sum(double a,double b,double c) {
			return (a+b+c);
		}
//		float sum(float a,float b,float c) {
//			return (a+b+c);
//		}
		// overloading the multiplication function
	public static void main(String[] args) {
		// method overloading 
//		this method can be done by using the return type or 
//				by changing the number of argument
// creating the class object of MethodsOverloading
		MethodsOverloading obj=new MethodsOverloading();
		int x=obj.sum(12, 45);
		int y=obj.sum(12, 12, 12);
		int z=obj.mul(10, 10);
        int p=obj.mul(2, 2, 2);
        double r=obj.sum(12.12, 12.22,12.22);
	System.out.println("sum method of two number : returns integer :"+x);
	System.out.println("sum method of three number: returns integer :"+y);
	System.out.println("Mutiply method of two number: returns integer :"+z);
	System.out.println("Mutiply method of three number: returns integer :"+p);
	System.out.println("sum method of sum of three number: returns double :"+r);
	}
}
