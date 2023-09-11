class DeamonMultiThreading extends Thread{
	public void run() {
			 if(Thread.currentThread().isDaemon()){//checking for daemon thread  
				   System.out.println("daemon thread work");  
				  }  
				  else{  
				  System.out.println("user thread work");  
				 } 
}}
public class Daemon_Thread {
	public static void main(String[] args) {
		DeamonMultiThreading t1=new DeamonMultiThreading();
		DeamonMultiThreading t2=new DeamonMultiThreading();
		DeamonMultiThreading t3=new DeamonMultiThreading();
		t1.setDaemon(true);//now t1 is daemon thread  
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
	}
}
