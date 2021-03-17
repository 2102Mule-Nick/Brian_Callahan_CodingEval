package test;

public class Person {

	private String FirstName;
	private String LastName;
	private int personid;
	private int fatherid;
	private int motherid;
	
	public Person(String firstName, String lastName, int fatherid, int motherid) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.fatherid = fatherid;
		this.motherid = motherid;
	}


	public int getFatherid() {
		return fatherid;
	}

	public void setFatherid(int fatherid) {
		this.fatherid = fatherid;
	}

	public int getMotherid() {
		return motherid;
	}

	public void setMotherid(int motherid) {
		this.motherid = motherid;
	}

	
	public Person(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public int getPersonid() {
		return personid;
	}



	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
			
	public Person(String firstName, String lastName, int personid) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.personid = personid;
	}


	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", personid=" + personid + "]";
	}
	
}
