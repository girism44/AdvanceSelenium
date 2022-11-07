package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Insertdata {

	public static void main(String[] args) throws SQLException {
		
		//step 1 create an object for dbdriver
		Driver dbdriver = new Driver();
		//import driver from com.mysql.cj jdbc only
		//new driver throws exception
		//step2 register the dbdriver to JDBC
		DriverManager.registerDriver(dbdriver);
		
		//step3 Establish the connecction
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
		//stpe 4 create the statement
		Statement statement = connection.createStatement();
		//step 5 execute the query
		int result=statement.executeUpdate("insert into wcsm18 (EmpId,EmpName,Address) values(1007,'aaaaaa','noida');");
		
		System.out.println("row affected"+result);
		//step 6 close the connection
		connection.close();
		
		
	}

}
