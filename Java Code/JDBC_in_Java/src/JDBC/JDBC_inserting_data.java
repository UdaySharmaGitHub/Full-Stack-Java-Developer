package JDBC;
// this operation is an runtime polymorphism
import java.sql.*;
public class JDBC_inserting_data {
	public static void main(String[] args)throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		try {
	// load the Driver
       	 Class.forName("com.mysql.cj.jdbc.Driver");
   // creating a connection
       	 String url="jdbc:mysql://localhost:3306/jdbc";
       	 String username="root";
       	 String pass="uday123";
   // use to get the connection   
       	 Connection con=DriverManager.getConnection(url,username,pass);
     // checking the connection
         if(con.isClosed()) {
       	 System.out.println("Connection is still closed");  }
     	 else {
       	 System.out.println("Connection is established");  }
     // creating a query
         String q="insert into stu (name,city) values (?,?)";
    // creating statement (Prepared statement)
     	PreparedStatement ps = con.prepareStatement(q); 
    // set the value of query
     	ps.setString(1,"Anshul Lakher");
     	ps.setString(2,"Kashipur");
    // now execute the query
     ps.executeUpdate(); // there is no need to pass the query q again
   // now we check the by convey a message that the data is inserted
     System.out.println("the data is inserted...");
    // closing the connection
     con.close();
		}catch(Exception e) { e.printStackTrace(); }
	}
}
