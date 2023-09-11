package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBC_Fetching_Data_MySQL {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// Connect to the MySQL Database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/jdbc";
        	 String username="root";
        	 String pass="uday123";
        	 Connection con=DriverManager.getConnection(url,username,pass);
      // Checking the Connection
           	 if(con.isClosed()) {
        		 System.out.println("Connection is still closed");
        	 }
        	 else {
        		System.out.println("Connection is established");
        	 	}
     //Generate the Query
        String query="select * from stu;";
   // Prepared the Query
        PreparedStatement pstmt=con.prepareStatement(query);
  // Execute the Query
        ResultSet rs=pstmt.executeQuery(query);
 // Fetching the data from database JDBC and the Table Stu
        while(rs.next()) {
        	System.out.println("ID :"+rs.getInt(1));
        	System.out.println("Name :"+rs.getString(2));
        	System.out.println("City :"+rs.getString(3));
        }
    	System.out.println("Data is Shown above ");
    	con.close();
		}catch(Exception e){  e.printStackTrace();  } 
}
}