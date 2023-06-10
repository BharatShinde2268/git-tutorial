package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/micro";
		String username="root";
		String pass="root";
		
		System.out.println("step 1");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("step 2");
		Connection con= DriverManager.getConnection(url,username,pass);
		System.out.println("Step 3");
		Statement stmt=con.createStatement();
		String query="select * from micro_user";
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("Step 4");
	//	System.out.println(executeQuery);
		
		while(rs.next())
		{
			String id = rs.getString(1);
			String about = rs.getString("abouts");
			String emails = rs.getString(3);
			String phone = rs.getString(4);
			String name = rs.getString("name"); // jr column number la konta data aahe mahit nahi tr kolam name takne
			
			System.out.println(id+" "+about+" "+emails+" "+phone+" "+name );
		}
		
	}

}
