package DAO;

public class User {

	private int id;
	private String name;
	private String phoneno;
	private String address;
	private String email;
	private String password;
	
	public User(int id, String name, String phoneno, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", address=" + address + ", email="
				+ email + ", password=" + password + "]";
	}

}
