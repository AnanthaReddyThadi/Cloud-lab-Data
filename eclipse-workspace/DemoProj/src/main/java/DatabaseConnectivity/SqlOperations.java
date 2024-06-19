package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlOperations {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ananthadb","root","rps@123");
		Statement stmt=con.createStatement();
		String ct="Create table Accounts(account-No int primary key,name varchar(50),City varchar(30),Balance Int);";
//		String cs="insert into Accounts (Account_No,Name,City,Balence) values (1,'Anantha','Rajesh',10000),(2,'subbu','narayana',3200)";
		
//		String rs="select* from Accounts;";
		
		
		
		stmt.execute(ct);
		
		System.out.println("Table created successfully");
		

	}

}
