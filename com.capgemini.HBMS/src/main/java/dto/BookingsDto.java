package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class BookingsDto 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	@Column
	private int roomId;
	@Column
	private String userId;
	@Column
	private String bookedfrom;
	@Column
	private String bookedTo;
	@Column
	private int noOfAdults;
	@Column
	private int noOfChildren;
	@Column
	private double amount;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookedfrom() {
		return bookedfrom;
	}
	public void setBookedfrom(String bookedfrom) {
		this.bookedfrom = bookedfrom;
	}
	public String getBookedTo() {
		return bookedTo;
	}
	public void setBookedTo(String bookedTo) {
		this.bookedTo = bookedTo;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BookingsDto [bookingId=" + bookingId + ", roomId=" + roomId + ", userId=" + userId + ", bookedfrom="
				+ bookedfrom + ", bookedTo=" + bookedTo + ", noOfAdults=" + noOfAdults + ", noOfChildren="
				+ noOfChildren + ", amount=" + amount + "]";
	}
	
}
