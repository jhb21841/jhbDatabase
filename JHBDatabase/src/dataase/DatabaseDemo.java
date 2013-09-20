package dataase;

public class DatabaseDemo {
	
	public static void main(String[] args) {

	//create constructors for demo addresses	
	Address Daddress = new Address("1132","Muberry Ln","B9","Herdon","VA","United States","22043");
	Address Kaddress = new Address("583B","Cherry Blossom Ct","-","Arlington","VA","United States","22201");
	
	//create constructors for demo dates created
	Date Ddate = new Date("09","02","2013");
	Date Kdate = new Date("11","27","2012");
	
	//create constructors for demo customers
	Customer Dmitri = new Customer("011","Dmitri Dolgopolov",Daddress,"7035380143","dmitri@dancefactory.com","male");
	Customer Kirill = new Customer("053","Kirill Gorjatsev",Daddress,"7034115895","kdballroom@dancefactory.com","male");
	
	
	
	//output
	System.out.println("Account information for client ID#: " + Dmitri.getId() + "\n" + Dmitri.getName() + "\n" +
			
			//address
			Daddress.getStNumber() + " " + Daddress.getStName() + " " + Daddress.getAptUnit() + " " + Daddress.getCity() +
			", " + Daddress.getState() + " " + Daddress.getCountry() + " " + Daddress.getZip() + "\n" +
			
			Dmitri.getPhoneNumber() + "\n" + Dmitri.getEmail() + "\n" + Dmitri.getGender());
	
	System.out.println("Account information for client ID#: " + Kirill.getId() + "\n" + Kirill.getName() + "\n" +
	
			//address
			Kaddress.getStNumber() + " "+ Kaddress.getStName() + " " + Kaddress.getAptUnit() + " " + Kaddress.getCity() +
			", " + Kaddress.getState() + " " + Kaddress.getCountry() + " " + Kaddress.getZip() + "\n" +
			
			Kirill.getPhoneNumber() + "\n" + Kirill.getEmail() + "\n" + Kirill.getGender());
	
	//Using toString to display the same information
	System.out.println("Dmitri's Customer Information:" + "\n" + Dmitri.toString() + "\n" + "This account was created on: "
		+ Ddate.toString());
	System.out.println("Kirill's Customer Information:" + "\n" + Kirill.toString() + "\n" + "This account was created on: "
			+ Kdate.toString());
		
		
	}

}
