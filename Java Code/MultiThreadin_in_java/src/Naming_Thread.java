class TestMultiNaming extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try{
				// Thread Prints Between 1s gaps
Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("The Exception is caught as : "+e);
			}
			System.out.print(i+"\t");
		}
	}
}
public class Naming_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultiNaming t1=new TestMultiNaming();
		TestMultiNaming t2=new TestMultiNaming();
		TestMultiNaming t3=new TestMultiNaming();
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());
		  System.out.println("Name of t1:"+t3.getName());  
		  t1.start();
		  t2.start();
		  t3.start();
		  t1.setName("Uday Sharma");
          t2.setName("Anshul Lakher");
          t3.setName("Yashas Gupta");
          System.out.println("After changing name of t1:"+t1.getName()); 
          System.out.println("After changing name of t2:"+t2.getName()); 
          System.out.println("After changing name of t3:"+t3.getName()); 
	}
}
