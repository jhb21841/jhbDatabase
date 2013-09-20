package dataase;

public class Address {

		//declare data and attributes
	private String stNumber;
	private String stName;
	private String aptUnit;
	private String city;
	private String state;
	private String country;
	private String zip;
	
		//create address
	public Address(String stNumber, String stName, String aptUnit, String city, String state, String country, String zip) {
		this.stNumber = stNumber;
		this.stName = stName;
		this.aptUnit = aptUnit;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	
	
		//create getters and setters
	public String getStNumber() {
		return stNumber;
	}
	public void setStNumber(String stNumber) {
		this.stNumber = stNumber;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getAptUnit() {
		return aptUnit;
	}
	public void setAptUnit(String aptUnit) {
		this.aptUnit = aptUnit;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	
	//create toString for address information
	public String toString() {
		return stNumber + " " + stName + " " + aptUnit + " " + city + " " + state + " " + country + " " + zip;
	}

	
	
	//end bracket
	}
