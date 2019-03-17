package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.HotelDto;
import dto.RoomDetailsDto;

public class HotelDaoImpl implements HotelDao
{

	public void hotelInfo() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		HotelDto hotel = new HotelDto();
		hotel.setAddress("khacharapara");
		hotel.setAvg_per_night_rate("4500");
		hotel.setCity("Delhi");
		hotel.setDescription("3 star hotel");
		hotel.setHotelname("Swagath Inn");
		hotel.setPhone_no("9800765764");
		hotel.setRating("4.5");
		hotel.setEmail("swagathin@gmail");
		hotel.setAvailabity("Available");
	
		
		
		manager.persist(hotel);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
	}
	public static void main(String[] args) 
	{
		HotelDaoImpl hotel=new HotelDaoImpl();
		
		hotel.hotelInfo();
	}

}
