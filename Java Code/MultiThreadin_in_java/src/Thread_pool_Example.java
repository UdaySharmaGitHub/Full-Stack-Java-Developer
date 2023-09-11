// important import statements  
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.SimpleDateFormat;
class WorkAssign implements Runnable {
	private String workassign;
// constructor of the class Tasks  
	public WorkAssign(String str) {
// initializing the field taskName   
		workassign = str;
	}
// Printing the task name and then sleeps for 1 sec  
// The complete process is getting repeated five times  
	public void run() {
		try {
			for (int j = 0; j <= 5; j++) {
				if (j == 0) {
					// Creating a object of the Date package
					Date dt = new Date();
//Creating a object of the SimpleDateFormat package
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
//prints the initialization time for every task  
					System.out.println("Initialization time for the task name: " + workassign + " = " + sdf.format(dt));
				} else {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
// prints the execution time for every task  
					System.out.println("Time of execution for the task name: " + workassign + " = " + sdf.format(dt));
				}
// 1000ms = 1 sec  
				Thread.sleep(1000);
			}
			System.out.println(workassign + " is complete.");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
public class Thread_pool_Example {
// Maximum number of threads in the thread pool  
	static final int MAX_TH = 3;
// main method  
	public static void main(String argvs[]) {
// Creating five new tasks  
		Runnable rb1 = new WorkAssign("WorkAssign 1");
		Runnable rb2 = new WorkAssign("WorkAssign 2");
		Runnable rb3 = new WorkAssign("WorkAssign 3");
		Runnable rb4 = new WorkAssign("WorkAssign 4");
		Runnable rb5 = new WorkAssign("WorkAssign 5");
// creating a thread pool with MAX_TH number of  
// threads size the pool size is fixed  
		ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);
// passes the Task objects to the pool to execute (Step 3)  
		pl.execute(rb1);
		pl.execute(rb2);
		pl.execute(rb3);
		pl.execute(rb4);
		pl.execute(rb5);
// pool is shutdown  
		pl.shutdown();
	}
}