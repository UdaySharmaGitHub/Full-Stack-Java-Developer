package JDBC;
// program for JDBC 1 program
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class First_JDBC_making_connection {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// using try catch to overcome or get the exception
		try{
       // load the Driver
        	 Class.forName("com.mysql.cj.jdbc.Driver");
    // creating a connection
        	 String url="jdbc:mysql://localhost:3306/jdbc";
        	 String username="root";
        	 String pass="uday123";
    // use to get the connection   
        	 Connection con=DriverManager.getConnection(url,username,pass);
        	 if(con.isClosed()) {
        		 System.out.println("Connection is still closed");
        	 }
        	 else {
        		System.out.println("Connection is established");
        	 }
		}catch(Exception e) {  e.printStackTrace();  }  // catch the exception
}
	}
