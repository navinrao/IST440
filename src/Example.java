import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;


public class Example {

	public static void main(String[] args) {
		
		
	            // Load the SQLServerDriver class, build the 
	            // connection string, and get a connection 
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	            String connectionUrl = "jdbc:sqlserver:oz-ist-iissql.abington.psu.edu" + 
	                                    "database=ist440grp1sp15;" + 
	                                    "user=ist440grp1sp15;" + 
	                                    "password=ist440grp1sp15"; 
	            Connection con = DriverManager.getConnection(connectionUrl); 
	            System.out.println("Connected."); 

	            // Create and execute an SQL statement that returns some data.  
	            String SQL = "SELECT UserName, PassWord FROM timesheet.login";  
	            Statement stmt = con.createStatement();  
	            ResultSet rs = stmt.executeQuery(SQL); 

	            // Iterate through the data in the result set and display it.  
	            while (rs.next())  
	            {  
	               System.out.println(rs.getString(1) + " " + rs.getString(2));  
	            } 
	}

}
