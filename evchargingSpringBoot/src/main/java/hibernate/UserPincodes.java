package hibernate;

import javax.persistence.*;

@Entity(name="user_pincodes")
@Table(name="user_pincodes")
public class UserPincodes 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private int pincode;
	
	@ManyToOne
	private Users user;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}
	
	public UserPincodesP toPOJO()
	{
		UserPincodesP u = new UserPincodesP();
		u.setId(id);
		u.setPincode(pincode);
		return u;
	}
	
}
