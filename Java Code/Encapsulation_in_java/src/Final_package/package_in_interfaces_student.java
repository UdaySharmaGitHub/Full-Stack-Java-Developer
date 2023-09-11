package Final_package;
import Package_example.Combining_interfaces_Student_1_2;
public class package_in_interfaces_student {
	public static void main(String[] args) {
		Combining_interfaces_Student_1_2 st1 =new Combining_interfaces_Student_1_2(),st2=new Combining_interfaces_Student_1_2();
		st1.setName("Uday Sharma");
		st1.setID(210404098);
		st1.setRoll_No(68);
		st1.setBranch("B.Tech,CSE");
		st2.setName("Anshul lakhera");
		st2.setID(210404090);
		st2.setRoll_No(61);
		st2.setBranch("B.Tech,CSE");
		st1.info();
		st2.info();
	}
}
