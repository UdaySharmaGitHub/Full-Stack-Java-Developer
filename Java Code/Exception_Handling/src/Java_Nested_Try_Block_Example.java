
public class Java_Nested_Try_Block_Example {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("dividing by the zero ");
				int b=10/0 ;
				System.out.println(b);
			}catch(Exception e) {System.out.println(e);}
		try {
			int a[]=new int[5];
			a[5]=90;
			System.out.println(a[5]);
		}catch(Exception e) {System.out.println(e);}

		System.out.println("other Staement ");
		} catch(Exception e) {    System.out.println("handled the exception (outer catch");}
			
		  System.out.println("normal flow.."); 
	}
}
