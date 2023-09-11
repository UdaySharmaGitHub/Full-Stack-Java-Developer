//         Polymorphism in inheritence
//     making an interface name MYCamera01
interface MYCamera01{
	public void takesnap();
	public void recordvedio();
//	creating a private method
	private void greet() {
		System.out.println("hello this is the private method");
	}
//	creating a default method 
	default void recordvedio4K() {
		greet();
		System.out.println("Recording vedio in 4K ..");
	}
}
//  making an another interface name MYWifi01
interface MYWifi01{
	String[] getNetworks();
    void connectToNetwork(String network);
}
//create a class name MYCellPhone01
class MYCellPhone01{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
//  making a class MYSmartPhone01 which is Extends the class 
//  MYCellPhone which implements both the interface in it
class MYSmartPhone01 extends MYCellPhone01 implements MYCamera01,MYWifi01{
	 public void takesnap(){
	        System.out.println("Taking snap");
	    }
	    public void recordvedio(){
	        System.out.println("Taking snap");
	    }
	    //    public void recordvedio4K(){
//	        System.out.println("Taking snap and recoding in 4k");
//	    }
	    public String[] getNetworks(){
	        System.out.println("Getting List of Networks ");
	        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
	        return networkList;
	    }
	    public void connectToNetwork(String network){
	        System.out.println("Connecting to " + network);
	    }
	    public void sampleMeth(){
	        System.out.println("meth");
	    }
}
public class PolymorphismInInheritence {
	public static void main(String[] args) {
//	this means this is smartphone but use as it camera	
  MYCamera01 cam =new MYSmartPhone01();
  // cam.getNetworks(); --> Not allowed
  // cam.sampleMeth(); --> Not allowed
  cam.recordvedio4K();
  MYSmartPhone01 s = new MYSmartPhone01();
  s.sampleMeth();
  s.recordvedio();
  s.getNetworks();
  s.callNumber(7979);
	}
}
