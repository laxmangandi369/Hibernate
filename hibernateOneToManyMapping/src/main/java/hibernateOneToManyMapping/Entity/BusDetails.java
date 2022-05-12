package hibernateOneToManyMapping.Entity;

import java.util.List;
import java.util.Set;

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
@Table
public class BusDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer busId;
	@Column(name = "bus_number")
	private String busNumber;
	@Column(name = "driver_name")
	private String driverName;
	
	@OneToMany
	@JoinColumn(name = "busId")
	private Set<Passenger> passenger;
	
	public BusDetails() {
	}
	
	public BusDetails(String busNumber, String driverName, Set<Passenger> bus) {
		super();
		this.busNumber = busNumber;
		this.driverName = driverName;
		this.passenger = bus;
	}

	public Integer getBusId() {
		return busId;
	}
	public void setBusId(Integer busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Set<Passenger> getBus() {
		return passenger;
	}

	public void setBus(Set<Passenger> bus) {
		this.passenger = bus;
	}
	
	
}
