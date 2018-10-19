
//Nathaniel


//import statements
import java.util.Scanner;



public class Driver {

	
	
	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in) ;
		String manufacturer;
	    String model;
		Double price;
		String carrier;
	
	
	System.out.println("Enter Phone Manufacturer");
    manufacturer = scanner.nextLine();
	
	System.out.println("Enter your model:  ");
    model = scanner.nextLine();
	
    System.out.println("Enter the price paid:  ");
    price = scanner.nextDouble();
	
    System.out.println("Enter your carrier:  ");
    carrier = scanner.nextLine();
	
    
	
	MobilePhone phone = new MobilePhone(manufacturer, model, price, carrier);
	
	
	
	
	
}//end Main
	
	}//end Driver
