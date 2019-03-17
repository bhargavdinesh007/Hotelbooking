package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.RoomDetailsDto;
import dto.StaffDto;

public class RoomDetailsDaoImpl implements RoomDetailsDao
{

	public void roomDetails() 
	{
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		RoomDetailsDto  room = new RoomDetailsDto();
		room.setHotelId("3614");
		room.setHotelName("vivera");
		room.setRoomNo("420");
		room.setRoomtype("delux");
		room.setAvailabitlity("available");
		room.setPer_night_rate("1200");
		
		manager.persist(room);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();
		
	}
	public static void main(String[] args) {
		RoomDetailsDaoImpl room=new RoomDetailsDaoImpl();
		room.roomDetails();
	}
}
