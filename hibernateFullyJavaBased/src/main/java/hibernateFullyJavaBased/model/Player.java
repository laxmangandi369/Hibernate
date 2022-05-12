package hibernateFullyJavaBased.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="all_player_details")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="player_type")
	private String sportsType;
	@Column(name="total_games_played")
	private Integer gamesPlayed;
	
	public Player() {
		super();
	}

	public Player(String firstName, String lastName, String sportsType, Integer gamesPlayed) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sportsType = sportsType;
		this.gamesPlayed = gamesPlayed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSportsType() {
		return sportsType;
	}

	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

	public Integer getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	
}
