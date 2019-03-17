package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.BookingsDto;
import dto.StaffDto;

public class BookingDaoImpl implements BookingsDao
{

	public void bookHotel() 
	{
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager=managerFactory.createEntityManager();
		manager.getTransaction().begin();
		BookingsDto booking =new BookingsDto();
		booking.setAmount(2500);
		booking.setBookedfrom("25-Jul-18");
		booking.setBookedTo("27-Jul-18");
		booking.setNoOfAdults(2);
		booking.setNoOfChildren(2);
		booking.setRoomId(404);
		booking.setUserId("222");
		
		manager.persist(booking);
		manager.getTransaction().commit();
		manager.close();
		managerFactory.close();

	}
	public static void main(String[] args) {
		BookingDaoImpl booking=new BookingDaoImpl();
		booking.bookHotel();
	}
}
