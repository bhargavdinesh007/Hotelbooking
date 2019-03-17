package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hotel")
public class HotelDto  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int hoteld;
	@Column
	private String city;
	@Column
	private String hotelname;
	@Column
	private String address;
	@Column
	private String avg_per_night_rate;
	@Column
	private String description;
	@Column
	private String availabity;
	@Column
	private String phone_no;
	@Column
	private String rating;
	@Column
	private String email;
	
	public int getHoteld() {
		return hoteld;
	}
	public void setHoteld(int hoteld) {
		this.hoteld = hoteld;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAvg_per_night_rate() {
		return avg_per_night_rate;
	}
	public void setAvg_per_night_rate(String avg_per_night_rate) {
		this.avg_per_night_rate = avg_per_night_rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getAvailabity() {
		return availabity;
	}
	public void setAvailabity(String availabity) {
		this.availabity = availabity;
	}
	@Override
	public String toString() {
		return "HotelDto [hoteld=" + hoteld + ", city=" + city + ", hotelname=" + hotelname + ", address=" + address
				+ ", avg_per_night_rate=" + avg_per_night_rate + ", description=" + description + ", phone_no="
				+ phone_no + ", rating=" + rating + ", email=" + email + "]";
	}

}
