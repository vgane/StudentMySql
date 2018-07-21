package jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/eduproject?autoReconnect=true&useSSL=false","root","password");
		Statement st=con.createStatement();
		String sql="create table userlogin(user varchar(30) primary key, password varchar(30))";
		
		try {
			st.execute(sql);
			System.out.println("DB table created");
		}
		catch(Exception e) {
		System.out.println("Exception:"+e.getMessage());
		}
	}

}
