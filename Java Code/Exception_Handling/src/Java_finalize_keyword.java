     //finalize keyword
public class Java_finalize_keyword {
	public static void main(String[] args) {
		Java_finalize_keyword obj=new Java_finalize_keyword();
		// printing The hashCode
		System.out.println("the hash code is : "+obj.hashCode());
		obj=null;
		System.gc();
		System.out.println("the end of the garbage collection : ");
	}
	// defining the finalize method
	protected void finalize() {
		System.out.println("calling the finalize() method :");
	}
}
