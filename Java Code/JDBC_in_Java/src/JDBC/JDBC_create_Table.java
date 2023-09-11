package JDBC;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
public class JDBC_create_Table {
	public static void main(String[] args){
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
      // checking the connection
         	 if(con.isClosed()) {
        	 System.out.println("Connection is still closed");  }
      	     else {
        	 System.out.println("Connection is established");  }
     // create a Query
         	String query="create table stu( id int(20) primary key auto_increment,Name varchar(100) not null ,city varchar(150))";
      // create statement
         	Statement stmt=con.createStatement();
       // Execute the statement by passing the query
         	stmt.executeUpdate(query);
         	System.out.println("Table created in database ");
      // closing the connection
         	con.close();
}catch(Exception e) {e.printStackTrace();}
}
}
