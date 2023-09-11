//       instanseof method/operator in java
class BASE00001{
String a;
String b;
public void setbase(String a,String b) {
	this.a=a;
	this.b=b;}
public String getbase() {
	return (a+" "+b) ;}}
class DERIVED0001 extends BASE00001{
	String c;
public void setderived(String c) {
	this.c=c;}
public String getderived() {
	return c;}}
public class Instanseof_operator {
	public static void main(String[] args) {
		Instanseof_operator i1=new Instanseof_operator();
		System.out.println(i1 instanceof Instanseof_operator);
		BASE00001 d1=new BASE00001();
		d1.setbase("uday","Sharma");
		System.out.println("the name is "+d1.getbase());
		DERIVED0001 d2=new DERIVED0001();
		d2.setbase("Vasu","Tripathi");
		System.out.println("the name is "+d2.getbase());
		System.out.println(d1 instanceof BASE00001);	     	
		System.out.println(d2 instanceof DERIVED0001);	
		BASE00001 d3=new DERIVED0001();
		System.out.println(d3 instanceof BASE00001);
		System.out.println(d3 instanceof DERIVED0001);

	}}

