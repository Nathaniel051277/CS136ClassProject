 //Nathaniel Snyder.
//MobilePhone

public class MobilePhone {

	private String manufacturer;
	private String model;
	private Double price;
	private String carrier;
	private String toString;
	public String number;
	
	
	
	
	public MobilePhone(String manufacturer, String model, Double price, String carrier) 
	{
		//super();
		
		
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
		this.toString = toString;
	
	
	
	
	}//end MobilePhone construct
	
	public String call(String number) {
		return "You are calling:  " + number;
	}
	
	
}//end Class MobilePhone
