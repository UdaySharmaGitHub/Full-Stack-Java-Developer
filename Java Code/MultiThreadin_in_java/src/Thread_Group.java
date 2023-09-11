// For using the THread Group we have to import the package
import java.lang.ThreadGroup;
// Thread Group ActiveGroupCount Example
class TG_activeGroupCount extends Thread{  
	TG_activeGroupCount (String tName, ThreadGroup tgrp)  
	{  
	super(tgrp, tName);  
	start();  
	}  
	public void run() {
		for(int j=0;j<5;j++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {System.out.println("The exception has been encountered " + e);  }
		}
	}
}
// Simple Thread Example
public class Thread_Group implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Thread_Group runnable=new Thread_Group();
  //Creating the object of the Thread group and name them
  ThreadGroup tg1=new ThreadGroup("Parent Thread Group");
  //Creating a Thread and put in the Group name tg1
	Thread t1=new Thread(tg1,runnable,"one");
	t1.start();
	Thread t2=new Thread(tg1,runnable,"Second");
	t2.start();
	Thread t3=new Thread(tg1,runnable,"Third");
	t3.start();
	Thread t4=new Thread(tg1,runnable,"Fourth");
	t4.start();
	  System.out.println("Thread Group Name: "+tg1.getName());    
      tg1.list();  
   // creating the a another thread group tg2
      ThreadGroup tg2 = new ThreadGroup("The parent group of threads"); 
      //Creating a Thread and put in the Group name tg2
      TG_activeGroupCount th1 = new TG_activeGroupCount("first", tg2);  
      System.out.println("Starting the first");  
      TG_activeGroupCount th2 = new TG_activeGroupCount("second", tg2);  
      System.out.println("Starting the second");  
      // checking the number of active thread by invoking the activeCount() method 
      // tg2 Thread Group contains two Thread
      System.out.println("The total number of active threads are: " + tg2.activeCount());  
    // Making child of the Thread tg2
      ThreadGroup childoftg2=new ThreadGroup(tg2,"Child of the THreadGroup-2(tg2)");
      TG_activeGroupCount childoftg2_th1 = new TG_activeGroupCount("first", childoftg2);  
      System.out.println("The total number of active threads are: " + childoftg2.activeCount());  
	  System.out.println("Thread Group Name: "+childoftg2.getName());    
	}
}
