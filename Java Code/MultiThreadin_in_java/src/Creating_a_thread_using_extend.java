class MyTHread1 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("the thread of class 1 is running ");
			System.out.println(i);
			i++;
		}}}
//Creating another Thread by Extending the class
class MyTHread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("the thread of class 2 is running ");
			System.out.println(i+1);
			i++;
		}}}
public class Creating_a_thread_using_extend {

	public static void main(String[] args) {
	//   creating an oblect of the thread classes
			MyTHread1 th1=new MyTHread1();
			MyTHread2 th2=new MyTHread2();
//			Both the Functions is running simultaneously
			th1.start();   // start method is given by the jvm 
	        th2.start();   // it is used start thread
	}}
