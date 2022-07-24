package com.bike.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.List;

import com.bike.bean.Bike;
import com.bike.dao.BikeDaoImpl;
import com.bike.dao.IBikeDao;

public class BikeServiceImpl implements IBikeService{
     
	@Override
	public void addBike(Bike bike) throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		iBikeDao.addBike(bike);
	}

	@Override
	public Bike getByRegdId(String regdId) throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		Bike b = iBikeDao.getByRegdId(regdId);
		return b;
	}

	@Override
	public Bike getByBikeName(String bikeName) throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		Bike b = iBikeDao.getByBikeName(bikeName);
		return b;
	}

	@Override
	public Bike deleteByRegdId(String regdId) throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		Bike b = iBikeDao.deleteByRegdId(regdId);
		return b;
	}

	@Override
	public void updateByRegdId(Bike b2, String fetchRegdId) throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		iBikeDao.updateByRegdId(b2, fetchRegdId);	
	}

	@Override
	public List<Bike> getAllBikes() throws SQLException {
		IBikeDao iBikeDao = null;
		iBikeDao = new BikeDaoImpl();
		List <Bike> listOfBikes = iBikeDao.getAllBikes();
		return listOfBikes;
	}

/*	@Override
	public void addBike(Bike bike) throws IOException, ClassNotFoundException {
		FileOutputStream fos= new FileOutputStream("bike.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(bike);
		fos.close();
		os.close();
		
		System.out.println("Bike Serialized");
		deserializeBike();
	}
	public void  deserializeBike() throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("bike.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object ob = ois.readObject();
		fis.close();
		ois.close();
		
		Bike bike = (Bike) ob;
		System.out.println(bike);
	}
*/
}
