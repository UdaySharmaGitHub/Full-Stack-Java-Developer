class ShutDown_EX1 extends Thread{    
    public void run(){    
        System.out.println("shut down hook task completed..");    
    }    
}    
public class ShutDown_hook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create RunTime Object r
Runtime r=Runtime.getRuntime();
r.addShutdownHook(new ShutDown_EX1());
System.out.println("Now main sleeping... press ctrl+c to exit");    
try{
	System.out.println("The Thread wait For 5 sec then Shut Down");	
	Thread.sleep(5000);
}catch (Exception e) {System.out.println("the Execption is "+e);} 
	}
}
