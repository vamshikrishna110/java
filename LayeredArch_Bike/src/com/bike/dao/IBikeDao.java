package com.bike.dao;

import java.sql.SQLException;
import java.util.List;

import com.bike.bean.Bike;

public interface IBikeDao {

	void addBike(Bike bike) throws SQLException;

	Bike getByRegdId(String regdId) throws SQLException;

	Bike getByBikeName(String bikeName) throws SQLException;

	Bike deleteByRegdId(String regdId) throws SQLException;

	void updateByRegdId(Bike b2, String fetchRegdId) throws SQLException;

	List<Bike> getAllBikes() throws SQLException;

	

}
