package onetoone;

import javax.persistence.*;

@Entity
public class Person {
	private int personId;
	private String personName;
	
	private PersonDetail persondetail;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "pdetail_fk")
	
	public PersonDetail getPersondetail() {
		return persondetail;
	}
	public void setPersondetail(PersonDetail persondetail) {
		this.persondetail = persondetail;
	}
	@Id
	@GeneratedValue
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	

}
