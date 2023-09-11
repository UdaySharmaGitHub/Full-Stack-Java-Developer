        // Final-Keyword
// used to access modifier which is used to apply restriction
//After Declaring final-Keyword its become constant and cannot 
// be modified ,cannot be overridden or inherited in other sub class
public class Java_final {
// Assigning the variable as final  
	final int age=18;
	void display() {
// it cannot be changed because it is final keyword
//		age=34; // throw an error
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_final obj1 =new Java_final();
		obj1.display(); // calling that function
	}
}
