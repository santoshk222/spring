package spittr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Spitter {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	long id;
	
	@NotNull
	@Size(min=5,max=16,message="{firstName.size}")
	String firstName;
	
	@NotNull
	@Size(min=10,max=15,message="{lastName.size}")
	String lastName;
	
	
	@NotNull
	@Size(min=3,max=8,message="{userName.size}")
	String userName;
	
	@NotNull
	@Size(min=8,max=15,message="{password.size}")
	String password;
	
	
	public Spitter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Spitter(long id){
		this.id=id;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
		
	

}
