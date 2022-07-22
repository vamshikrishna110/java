package com.cf.sql;

import java.beans.Statement;
import java.sql.*;

public class Sql {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		java.sql.Statement statement = con.createStatement();
		ResultSet res = statement.executeQuery("select * from bikes");
		System.out.println(res);
		while(res.next()) {
			System.out.println(res.getInt("id") +" " +  res.getString("name"));
		}
	}

}
