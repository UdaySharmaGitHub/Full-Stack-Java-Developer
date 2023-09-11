class SleepThread extends Thread{
  public void run() {
	  int n=5;
	  for(int i=1;i<n;i++) {
		  try {
// Each Threads waits for 1sec = 100msec			  
			  Thread.sleep(1000);
		  }catch(Exception e) {
			  System.out.println(e);  }
		  System.out.println(i);  }
  }
}
class NegativeSleepThread extends Thread{
	  public void run() {
		  int n=5;
		  for(int i=1;i<n;i++) {
			  try {
	// Giving the -ve time of the Thread so its gives the error			  
				  Thread.sleep(-500);
			  }catch(Exception e1) {
				  System.out.println(e1);  }
			  System.out.println(i);   }
	  }
	}
public class Sleeping_in_Thread { 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t1=new SleepThread();
		SleepThread t2=new SleepThread();
		t1.start();// after this Thread is on sleep 
// its picks the t2 Thread and after t2 goes Sleep its 
 //  pick again t1 and this  goes on until all the Thread is printed
		t2.start();
// Making the Object of the NegativeSleepThread class
		NegativeSleepThread t3=new NegativeSleepThread();
		t3.start();
//What if we call Java run() method directly instead start() method?
// using the direct run method it not Treated as the Threads 
	// Its Treated as the normal method with the time delay of 1000milisec
		t1.run();
		t2.run();
	}
}
