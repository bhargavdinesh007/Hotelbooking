package dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roomDetails")
public class RoomDetailsDto 
{
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roomId;
	@Column
	private String hotelId;
	@Column
	private String hotelName;	
	@Column
	private String roomNo;
	@Column
	private String roomtype;
	@Column
	private String per_night_rate;
	@Column
	private String availabitlity;
	
	
	@Override
	public String toString() {
		return "RoomDetailsDto [roomId=" + roomId + ", hotelId=" + hotelId + ", hotelName=" + hotelName + ", roomNo="
				+ roomNo + ", roomtype=" + roomtype + ", per_night_rate=" + per_night_rate + ", availabitlity="
				+ availabitlity + "]";
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getPer_night_rate() {
		return per_night_rate;
	}
	public void setPer_night_rate(String per_night_rate) {
		this.per_night_rate = per_night_rate;
	}
	public String getAvailabitlity() {
		return availabitlity;
	}
	public void setAvailabitlity(String availabitlity) {
		this.availabitlity = availabitlity;
	}
	
	
}