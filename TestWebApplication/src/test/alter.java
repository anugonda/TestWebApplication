package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class alter {

	public static void main(String[] args) {
		Connection connection;

		
		String url="jdbc:mysql://localhost:3306/18312";
		String username="root";
		String password="18312As@";
		System.out.println("connecting to database..");
		connection = null;
		System.out.println("Database connected!");
		Statement stmt = null;
		try	{
			connection =DriverManager.getConnection(url,username,password);
			System.out.println("DataBase connected");
		}
		catch (SQLException e) {
			 throw new IllegalStateException("Cannot connect the database!", e);		 	
		}
		
		try
		{
			//Connection connection = null;
			String sql="ALTER TABLE college add status varchar(30)";
			stmt =  (Statement) connection.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("table is altered successfully");
	
		}
		catch (SQLException e1)
		{
			 System.out.println(" Exception " +e1);
		}
		finally{
			System.out.println("Close");
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(" Exception closing database connection " +e);
			}
		}
				

	}

}
