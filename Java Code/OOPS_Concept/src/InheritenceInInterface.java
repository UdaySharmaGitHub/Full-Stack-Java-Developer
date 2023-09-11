//Remember that interface cannot implement another interface only classes can do that!
/*
 public interface Interface 1 {
              void meth1 (); 
            }
public interface Interface 2 extends Interface 1 { 
               void meth 2( );
              }
 */
//   Above is Possible But if "extends" replace with the "implement" the 
//   then it is not possible
interface SMaple01{
	public void Meth1();
    public void Meth2(); 
}
//extending the interface Smaple01 into another interface CildofSMaple01
interface ChildofSMaple01 extends SMaple01{
	public void Meth3();
    public void Meth4(); 
}
//Creating a class to implements the extended interface
class ACCessInterFaces implements ChildofSMaple01{
//	defining the methods present in the above interfaces
	public void Meth1(){
        System.out.println("This is Meth1 of the base interface");
    }
    public void Meth2(){
        System.out.println("This is Meth2 of the base interface");
    }
    public void Meth3(){
        System.out.println("This is Meth3 of the extended interface");
    }
    public void Meth4(){
        System.out.println("This is Meth4 of the extended interface");
    }
}
public class InheritenceInInterface {
	public static void main(String[] args) {
//creating an object of the class to access the methods
		ACCessInterFaces a1=new ACCessInterFaces();
		a1.Meth1();
		a1.Meth2();
		a1.Meth3();
		a1.Meth4();
	}
}
