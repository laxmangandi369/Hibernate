package hibernateOneToManyMapping.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_details")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "passenger_name")
	private String name;
	@Column(name="passenger_mobile_number")
	private String mobileNumber;
	@ManyToOne
	
	BusDetails bus;
	
	public Passenger() {
		super();
	}

	public Passenger(String name, String mobileNumber) {
		
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	

}
