package ch.andres.springlearning.users;

public class User {
	private int id;
	private String prename;
	private String lastname;
	private int age;
	private String address;
	private String birthdate;
	
	public User() {
		
	}
	
	public User(int id, String prename, String lastname, int age, String address, String birthdate) {
		this.id = id;
		this.prename = prename;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.birthdate = birthdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}
