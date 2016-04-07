package tlam26;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String id;
	/*@Autowired*/
	@Resource
	private Person person;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
