//   Creating an interface name ANimal
interface ANimal{	
	public default void ANimal() {
		System.out.println("this is description of the animal ");
	}
	public String dog();
	public String cat();
	public String cow();
}
//Make a derived class from the interface ANimal using implements
class SoundsFromANimal implements ANimal{
//	overriding the method which is declared in the interface
	@Override
	public String dog() {
		return "Bow BOw Bow BOw";
	}
	@Override
	public String cat() {
		return "meow meow meow meow";
	}
	@Override
	public String cow() {
		return "moo moo moo moo";
	}
}
public class InterfaceImplementExample {
	public static void main(String[] args) {
		 SoundsFromANimal s1=new  SoundsFromANimal();
//		 Checking the object instance
		 System.out.println(s1 instanceof SoundsFromANimal);
		 s1.ANimal();
		 System.out.println("the sounds from the dciffrenet Animals is\n"
		 +s1.cat()+"\n"+s1.cow()+"\n"+s1.dog());
	}}
