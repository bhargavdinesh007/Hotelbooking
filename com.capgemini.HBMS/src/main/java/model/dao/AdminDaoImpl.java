package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import dto.AdminDto;
import dto.HotelDto;
import dto.RoomDetailsDto;

public class AdminDaoImpl implements AdminDao {

	public void adminLogin()
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		AdminDto admin=new AdminDto();
		admin.setUsername("salmana");
		admin.setPassword("baadsha");
		
		
		manager.persist(admin);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		

	}

	public void addHotel()
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		HotelDto hotel = new HotelDto();
		hotel.setAddress("akkkayapalemu");
		hotel.setAvg_per_night_rate("7000");
		hotel.setCity("vizag");
		hotel.setDescription("5 star hotel");
		hotel.setHotelname("Novotel");
		hotel.setPhone_no("8700675437");
		hotel.setRating("4.7");
		hotel.setEmail("novetelvizag@gmail");
		hotel.setAvailabity("Available");
	
		
		
		manager.persist(hotel);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
		
	}

	public void deleteHotel() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();

		HotelDto hotel= manager.find(HotelDto.class,"1475");
		manager.remove(hotel);
		
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
	}

	public void modifyHotel() 
	{
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();

		HotelDto hotel= manager.find(HotelDto.class,"1475");
         hotel.setAddress("malancha");
         hotel.setRating("4.0");
         hotel.setAvg_per_night_rate("4000");
        
         manager.persist(hotel);
         manager.getTransaction().commit();
        
 		manager.close();
 		managerFactory.close();
 		
		
	}

	public void addRooom()
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		RoomDetailsDto  room = new RoomDetailsDto();
		room.setHotelId("14750");
		room.setHotelName("vivera");
		room.setRoomNo("440");
		room.setRoomtype("A/C delux");
		room.setAvailabitlity("available");
		room.setPer_night_rate("1600");
		
		manager.persist(room);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
		
	}

	public void deleteRooom() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();

		RoomDetailsDto Room = manager.find(RoomDetailsDto.class, 1);
		manager.remove(Room);
		
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();

		
	}

	public void modifyroom() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();

			RoomDetailsDto room=manager.find(RoomDetailsDto.class,2);
			     room.setAvailabitlity("Not Available");
			     room.setPer_night_rate("7500");
			     room.setRoomtype("Suit Room");
			     manager.persist(room);
	             manager.getTransaction().commit();
		        
 		manager.close();
 		managerFactory.close();
		
	}
	public void checkHotelavailability() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		
		HotelDto hotel=manager.find(HotelDto.class,1);
		String available=hotel.getAvailabity();
		String hotelname=hotel.getHotelname();
		System.out.println("hotel is"+available+"hotel name is"+hotelname);

		
		manager.close();
		managerFactory.close();
		
		
	}


	public static void main(String[] args)
	{
		AdminDaoImpl Admin=new AdminDaoImpl();
		//Admin.adminLogin();
		//Admin.addHotel();
		//Admin.modifyHotel();
		//Admin.addRooom();
		//Admin.deleteRooom();
		//Admin.modifyroom();
		Admin.checkHotelavailability();
		
	}

	
}
