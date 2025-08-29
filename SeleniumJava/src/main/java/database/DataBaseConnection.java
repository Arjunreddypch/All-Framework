package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DataBaseConnection {
	
	public static void main(String[] args) throws SQLException {
		
		//       "jdbc:mysql://"+host+":port"+"/databasename"
		String localHost="localhost";
		String port="3306";
		Connection connection=DriverManager.getConnection("jdbc:mysql://"+localHost+":"+port+"/qadbt", "root", "#Arjun789");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("select * from EmployeeInfo where name='bam'");
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getInt("age"));
			System.out.println(rs.getInt("id"));
		}
		
	}

}
