package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ClientData<statement> {
	public static void main(String[] args) {
		try{
	String url = "jdbc:mysql://localhost:3306/18312";
	String username = "root";
	String password = "18312As@";
	
	System.out.println("Connecting database..");
	Connection connection;
	Statement statement;
	
	try 
	
	{	
			connection= DriverManager.getConnection(url, username, password);
			System.out.println("Database connected!");
		} 
	
	catch (SQLException e) 
	{
	    throw new IllegalStateException("Cannot connect the database!", e);
	}
	
	String query = "SELECT * FROM college";
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
 
    while (rs.next())
    {
      int id = rs.getInt("id");
      String name = rs.getString("name");
      int marks = rs.getInt("marks");
      int age = rs.getInt("age");
      String city =rs.getString("city");
      
	System.out.println("Requested data :");
    }
    st.close();
  }
  catch (Exception exp)
  {
    System.err.println("Got an exception! ");
    System.err.println(exp.getMessage());
  }
	}
}