//Creating a Runnable interface by Extending the class
class MyRUNAbleTHread1 implements Runnable{
	@Override  // overriding the method so it runs freely
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("the thread of class 1 is running ");
			System.out.println(i);
			i++;
		}}}
//Creating another Runnable interface by Extending the class
class MyRUNAbleTHread2 implements Runnable{
	@Override               // overiding the method so it run freely
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("the thread of class 2 is running ");
			System.out.println(i+1);
			i++;
		}}}
public class Thread_using_Runnable_interface {
	public static void main(String[] args) {
//		creating of the first Runnable interface object
		MyRUNAbleTHread1 sprint1 =new MyRUNAbleTHread1();
//		decalaring the object into thread
		Thread t1=new Thread(sprint1);
//		craeting of the second Runnable interface object
		MyRUNAbleTHread2 sprint2 =new MyRUNAbleTHread2();
//		decalaring the object into thread
		Thread t2=new Thread(sprint2);
		t1.start();
		t2.start();
	}}
