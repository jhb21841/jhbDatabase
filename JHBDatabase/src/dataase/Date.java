package dataase;

public class Date {

		//declare data and attributes
	private String day;
	private String month;
	private String year;
	
		//create date
	public Date(String month, String day, String year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
		//create getters & setters
	public String getday() {
		return day;
	}
	public void setday(String day) {
		this.day = day;
	}
	public String getmonth() {
		return month;
	}
	public void setmonth(String month) {
		this.month = month;
	}
	public String getyear() {
		return year;
	}
	public void setyear(String year) {
		this.year = year;
	}
	
	//create toString for date information
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	
	
	//end bracket
	}
