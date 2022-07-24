package com.bike.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bike.bean.Bike;

public class BikeDaoImpl implements IBikeDao{

	@Override
	public void addBike(Bike bike) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "INSERT INTO bikes VALUES(?,?,?,?)";
		PreparedStatement st = con.prepareStatement(str);
//		String id = bike.getRegdId();
//		String name = bike.getBikeName();
//		String color = bike.getColor();
//		float price = bike.getPrice();
		
		st.setString(1, bike.getRegdId());
		st.setString(2, bike.getBikeName());
		st.setString(3, bike.getColor());
		st.setFloat(4, bike.getPrice());
		
		int update = st.executeUpdate();
		System.out.println(update + "row inserted");
	}

	@Override
	public Bike getByRegdId(String regdId) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "SELECT * FROM bikes WHERE id = ?";
		PreparedStatement st = con.prepareStatement(str);
		st.setString(1, regdId);
		ResultSet rs = st.executeQuery();
		//System.out.println(rs);// oracle.jdbc.driver.OracleResultSetImpl@5b03b9fe
		Bike b = null;
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String color = rs.getString(3);
			Float price = rs.getFloat(4);
			b = new Bike(id,name,color,price);
		}
		return b;
	}

	@Override
	public Bike getByBikeName(String bikeName) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "SELECT * FROM bikes WHERE name = ?";
		PreparedStatement st = con.prepareStatement(str);
		st.setString(1, bikeName);
		ResultSet rs = st.executeQuery();
		//System.out.println(rs);// oracle.jdbc.driver.OracleResultSetImpl@5b03b9fe
		Bike b = null;
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String color = rs.getString(3);
			Float price = rs.getFloat(4);
			b = new Bike(id,name,color,price);
		}
		return b;
	
	}

	@Override
	public Bike deleteByRegdId(String regdId) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "DELETE * FROM bikes WHERE id = ?";
		PreparedStatement st = con.prepareStatement(str);
		st.setString(1, regdId);
		int status = st.executeUpdate();
		System.out.println(status + "row deleted");
	    return null;
	}

	@Override
	public void updateByRegdId(Bike b2, String fetchRegdId) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "UPDATE bikes SET id = ?,name =?,color =?, price=? WHERE id = ?";
		PreparedStatement st = con.prepareStatement(str);
		
		st.setString(1, b2.getRegdId());
		st.setString(2, b2.getBikeName());
		st.setString(3, b2.getColor());
		st.setFloat(4, b2.getPrice());
		st.setString(5, fetchRegdId);
		
		int update = st.executeUpdate();
		System.out.println(update + "row updated");
		
	}

	@Override
	public List<Bike> getAllBikes() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "V@mshi1106");
		String str = "SELECT * FROM bikes";
		PreparedStatement st = con.prepareStatement(str);
		//st.setString(1, regdId);
		ResultSet rs = st.executeQuery();
		
		List <Bike> listOfBikes = new ArrayList();
		
		Bike b = null;
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String color = rs.getString(3);
			Float price = rs.getFloat(4);
			b = new Bike(id,name,color,price);
			listOfBikes.add(b);
		}
		return listOfBikes;
	}

}

// create table bikes(id varchar(250), name varchar(250), color varchar(250), price number);