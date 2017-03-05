package test;



import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class College 
{
	public static String getCollegeDetails() 
	{
		String url = "jdbc:mysql://localhost:3306/18312";
		String username = "root";
		String password = "18312As@";

		System.out.println("Connecting database...");
		Connection connection;
		try 
		
			{	
				connection= DriverManager.getConnection(url, username, password);
				System.out.println("Database connected!");
			} 
		
		catch (SQLException e) 
		{
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
		
		Statement stmt = null;
		String query ="select name,id,marks,city,age from college";
				
		 String output = "";    

		try {
			
		        stmt =  connection.createStatement();
		        ResultSet rs = ((java.sql.Statement) stmt).executeQuery(query);
		        while (rs.next()) 
		        {
		            String Name = rs.getString("name");
		            int id = rs.getInt("id");
		            int marks = rs.getInt("marks");
		            int age = rs.getInt("age");
		            String city = rs.getString("city");
		            output = output + Name + "\t" + id +"\t" + marks + "\t" + age +"\t" + city;
		        }
		
	} 
	
	catch (SQLException error ) 
		{
        System.out.println(" Exception " +error);
		}
	finally 
	
	{
        if (stmt != null) 
        
			        {
			        System.out.println("Close");
			        }
    
	}
		
		return output;
	}
}



			

	


