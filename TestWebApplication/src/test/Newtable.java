package test;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class Newtable {

	public static void main(String[] args) {
		
		DatabaseConnection db=new DatabaseConnection();
		Connection connection=  db.getConnection();
		//Statement stmt=null;
		System.out.println("creating table in database");
			try{
					Statement stmt=connection.createStatement();
					//ResultSet rs = stmt.executeQuery();
			     //   while (rs.next()) 
			        	{	
			        		String sql="create table COMPANY" + 
											("(EMP_ID varchar not null,"+ 
											"First Name char(20)" +
											"Last Name char(20) "+
											"Email_id varchar(20)"+ 	
											"Phone int(10)"+ 	
											"Hiredate int(20)"+
											"Location varchar(20)"+
											"Salary double(20) "+
											"Experiance int(10)"+
											"Project_name char(10)");
			     
			        	}
					System.out.println("created table with given data");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
				
				System.out.println("close");
			}
			
			
}

	private static ResultSet executeQuery() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	


	
	
