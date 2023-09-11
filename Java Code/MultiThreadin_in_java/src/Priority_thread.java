class TestMultiPriority extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try{
				// Thread Prints Between 1s gaps
Thread.sleep(1000);
// This help us to know get the current state of the Thread is running
System.out.println("The current State of the Thread is "+Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println("The Exception is caught as : "+e);
			}
			System.out.print(i+"\t");   }
	}
}
public class Priority_thread {
	public static void main(String[] args) {
		TestMultiPriority t1=new TestMultiPriority();
		TestMultiPriority t2=new TestMultiPriority();
		TestMultiPriority t3=new TestMultiPriority();
		System.out.println("Priority of the thread t1 is : " + t1.getPriority()); 
		System.out.println("Priority of the thread t2 is : " + t2.getPriority()); 
		System.out.println("Priority of the thread t3 is : " + t3.getPriority()); 
		// Setting the priority of the Thread
		t1.setPriority(9);
		t2.setPriority(4);
		t3.setPriority(7);
		System.out.println("Priority of the thread t1 is : " + t1.getPriority()); 
		System.out.println("Priority of the thread t2 is : " + t2.getPriority()); 
		System.out.println("Priority of the thread t3 is : " + t3.getPriority()); 
		t1.start();
		t2.start();
		t3.start();
	}
}
