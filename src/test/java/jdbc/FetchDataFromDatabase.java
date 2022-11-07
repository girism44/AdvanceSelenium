package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabase {
	public static void main(String[] args) throws SQLException {
		//step1 create an object for db driver
		Driver dbdriver = new Driver();
		//import driver from com.mysql.cj jdbc only
		//new driver throws exception
		
		//step2 Register this dbdriver to JDBC 
		DriverManager.registerDriver(dbdriver);
		
		//step3 Establish the JDBC connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		
		// Step 4 create the statement 
		Statement statement = connection.createStatement();
		
		//step5 execute the query
		ResultSet result=statement.executeQuery("select * from wcsm18");
		
		//step6 fetch the data
		while(result.next())
		{
			System.out.println(result.getInt("EmpId")+"\t"+result.getString("EmpName")+"\t"+result.getString("Address"));
		}
		//step 7 close the connection
		connection.close();
	}

}
