public class Grabage_Collection {
protected void finalize() { 
	System.out.println("The Grabage is Collected!!!...");
}
	public static void main(String[] args) {
  Grabage_Collection gc1=new Grabage_Collection();
  Grabage_Collection gc2 =new Grabage_Collection();
  gc1=null;
  gc2=null;
// gc() method run Twice Because The There is Two Object Which is Pointing NULL
  System.gc();
	}
}
