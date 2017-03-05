package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		DatabaseConnection db = new DatabaseConnection();
		Connection connection=db.getConnection();
		PreparedStatement update=null;
		PreparedStatement alter=null;
		try {
			 update=connection.prepareStatement("update college set marks=? where name=?");
			 alter=connection.prepareStatement("alter college add= ?");
			 update.setInt(1, 67);
			 update.setString(2, "dolly");
			 update.executeUpdate();
			 System.out.println("updated the statement");
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


