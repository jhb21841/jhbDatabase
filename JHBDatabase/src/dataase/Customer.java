package dataase;

public class Customer {

		//declare data and attributes
	private String id;
	private String name;
	private Address address;
	private String phoneNumber;
	private String email;
	private String gender;
	private Date dateCreated;
	
		//create customer
	public Customer(String id, String name, Address address, String phoneNumber, String email, String gender) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
	}
	
	
		//create getters and setters
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}

		
		/* SIDE NOTE: Constructor allows you to give the variable a value as soon as you create the object
			So we can use this line of code instead of a setter:
		
		public Customer(String newId) {
			id = newId;
		}
		
		*/
		
		
		//create toString for customer information
		public String toString() {
			return "ID Number: " + id + ", Name: " + name + ", Address: " + address.toString() + ", Phone Number:"
					+ phoneNumber + ", E-mail: " + email + ", Gender: " + gender;
		}
		/* NOTE: the address.toString can be put inside this customer toString OR used separately in the Database Demo
		like the date toString was used*/
		
		
		
	//end bracket
	}

