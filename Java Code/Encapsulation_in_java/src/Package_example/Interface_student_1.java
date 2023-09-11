package Package_example;
public interface Interface_student_1 {
	 default void info() {
		System.out.println("this is the 1st interface ");	
	}
	 public void setName(String name);
	 public String getName();
	 public void setID(int id);
	 public int getID();
}
