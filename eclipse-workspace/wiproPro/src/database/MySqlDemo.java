package database;

import java.sql.SQLException;    
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class MySqlDemo {
	

	public static void main(String[] args) throws SQLException {
		
		
		
		
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ananthadb","root","rps@123");
		Statement stmt=con.createStatement();
		
//		String s="select * from Personss";
		String ss="insert into Personss(PersonID,LastName ,FirstName,addresh ,city ) values (14,'thadi','satish','Nr nagar','chennai');";
		stmt.execute(ss);
//		stmt.execute(s);
		con.close();
		System.out.println("Executed Successfully");
	}
}

