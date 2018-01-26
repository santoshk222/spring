package spittr;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Spittle {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private final Long id;
	
	@ManyToOne(targetEntity=Spitter.class)
	private long spitter_id;
	
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;
	
	public Spittle(String message, Date time) {
		this(message,time,null,null);
	}

	public Spittle(String message, Date time, Double latitude, Double longitude) {
		this.id=null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
	
	
	
	

}
