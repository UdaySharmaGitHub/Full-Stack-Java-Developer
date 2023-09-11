class Mythread extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try{
				Thread.sleep(300);
	// Its gives the number of Thread is Executed or in Execution
		 System.out.println("The current State of the Thread is "+Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println("The Exception is caught as : "+e);
			}
			System.out.println(i+"\t");
		}
	}
}
public class Join_method_MultiThreading {
	public static void main(String[] args) {
		// Creating 3 threads
   Mythread t1=new Mythread();
   Mythread t2=new Mythread();
   Mythread t3=new Mythread();
// starts a t1 Thread
   t1.start();
	try{
		// starting the second thread after when  
		// the first thread th1 has ended or died. 
t1.join();
// Below line of code gives the output of the Thread declared is as main Thread
System.out.println("The current State of the Thread is "+Thread.currentThread().getName());
	}catch(Exception e) {
		System.out.println("The Exception is caught as : "+e);
	
	}
	// starts a t2 Thread
	t2.start();
		try{
			// starting the Third thread after when  
			// the Second thread th1 has ended or died. 
	t2.join();
	// Below line of code gives the output of the Thread declared is as main Thread
	System.out.println("The current State of the Thread is "+Thread.currentThread().getName());
		}catch(Exception e) {
			System.out.println("The Exception is caught as : "+e);
		
		}
		// starts a t3 Thread
		   t3.start();
}}
