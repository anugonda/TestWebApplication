package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static void main(String[] args) {
		
		System.out.println("connecting Database");
		 String url="jdbc:mysql://localhost:3306/18312";
		 String userName="root";
		 String password="18312As@";
		 
		System.out.println("connecting Database");
		Connection connection;
		try
		{
			connection =DriverManager.getConnection(url,userName,password);
		    System.out.println("DataBase connected");
		}
		catch (Exception e)
		{
		 throw new IllegalStateException("Cannot connect the database!", e);
		}
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
