package JDBC;
import java.io.*;
import java.sql.*;
public class Inserting_data_dyanamic_input {
	public static void main(String[] args) {
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
         String q="insert into stu(name,city) values (?,?)";
     // prepared statement
         PreparedStatement pstmt= con.prepareStatement(q);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     // Taking user input
         System.out.print("Enter your name : ");
         String name=br.readLine();
         System.out.println("Enter the city : ");
         String city=br.readLine();
         // set the value of query
      	pstmt.setString(1,name);
      	pstmt.setString(2,city);
        // now execute the query
      	pstmt.executeUpdate();
        // now we check the by convey a message that the data is inserted
        System.out.println("the data is inserted...");
       // closing the connection
        con.close();
		}catch(Exception e) {  e.printStackTrace(); }
	}}
