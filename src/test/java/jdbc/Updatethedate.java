package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Updatethedate {

	public static void main(String[] args) throws SQLException {
		//step1 create an object for db driver
				//This will throw an sql exception
				Driver dbdriver = new Driver();
				
				//step2 Register this dbdriver to JDBC
				DriverManager.registerDriver(dbdriver);
				
				//step3 Establish the JDBC conneection
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel","root","root");
				//step 4 create the statement
				Statement statement = connection.createStatement();
				
				//step 5 execute the query
				int result=statement.executeUpdate("update wcsm18 set EmpName='pqr' where EmpId='1005'");
			
				System.out.println("row affected"+result);
				
				//step 6 close the connection
				connection.close();

	}

}
