package Package_example;
public class Combining_interfaces_Student_1_2 implements Interface_student_1,Interface_student_2 {
	protected int id;
	protected int roll_no;
	public String name;
	public String branch;
	@Override
	public void setBranch(String branch) {
		// TODO Auto-generated method stub
		this.branch=branch;
	}
	@Override
	public String getBranch() {
		// TODO Auto-generated method stub
		return branch;
	}
	@Override
	public void setRoll_No(int roll_no) {
		// TODO Auto-generated method stub
		this.roll_no=roll_no;	
	}
	@Override
	public int getR0ll_no() {
		return roll_no;
	}
	@Override
	public void setName(String name) {
		this.name=name;	
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("the name is "+name+" and the Branch is "+branch+
				" and the ID and roll no is "+id+","+roll_no);	
	}
}
