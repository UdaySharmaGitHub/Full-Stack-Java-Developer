//Acess modifiers are of the four types:-
//   private/public/protected/default
//    and the getter and the setter  is used to  access the private 
//     datatypes/modifier
class Employees {
	private int ID;      // private datatype/modifier
	private int roll_no;   // private modifiers
	String name; // this is default so its public access modifiers
	public void private_acess_modi() {
		System.out.println("this is the private access modifiers so cannot show "+ID);
	}
	public void public_acess_modi() {
		System.out.println("this is the public access modifiers so it show "+name);
	}
//	getter and setter is used to access the private  members
//	creatin a setter mutator
	public void set_id(int i) {
		ID=i;
	}
	public void set_roll_no(int i) {
		roll_no=i;
	}
//	creating a getter accessors
	public int get_id(){
		return ID;  // return the private value
	}
	public int get_roll_no(){ // return the private values
		return roll_no;
	}
}
public class Accessmodifier_Setter_getter {
	public static void main(String[] args) {
		// creating a object of class employee
		Employees e1=new Employees();
		// this is the private access modifiers so it cannot show
		e1.private_acess_modi(); 
//		this is the public access modifier so we can access it 
		e1.public_acess_modi();
		e1.set_id(456);
		e1.set_roll_no(1);
//		printing the private members/datatypes
		System.out.println(e1.get_roll_no());
		System.out.println(e1.get_id());
	}
}
