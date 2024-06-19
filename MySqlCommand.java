package DatabaseConnectivity;

import java.sql.SQLException;    
import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlCommand {
	

	public static void main(String[] args) throws SQLException {
		
		
		
		
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ananthadb","root","rps@123");
		Statement stmt=con.createStatement();
	
		
//		String ss1="delete from personss where personId=4;";
		String ss2="update Personss set city='Bangalore' where city='HYD';";
//		String s="select * from Personss";
//		String ss="insert into Personss(PersonID,LastName ,FirstName,addresh ,city ) values (14,'thadi','satish','Nr nagar','chennai');";
		String   st="select * from personss where personsid=? and  firstrName=? ";
		String Query="select * from Personss";
		
		PreparedStatement pstmt=con.prepareStatement(Query);
		pstmt.setString(1,"Anantha");
		pstmt.setInt(1,4);
		
		ResultSet rs=pstmt.executeQuery();
		while (rs.next())
		{
			int id=rs.getInt("personId");
			String Lname=rs.getString("lastname");
			String fname=rs.getString("FirstName");
			String adds=rs.getString("Addresh");
			String city=rs.getString("City");
			
			
			System.out.println(id+" "+Lname+" "+fname+ " "+ adds+" "+city);
			
			
			
			
		}
		con.close();
		

//		stmt.execute(ss2);
////		stmt.execute(s);;
//		con.close();
//		System.out.println("Executed Successfully");
	
	}
}

