package ParkingTicket;
import java.util.Scanner;

public class PoliceOfficer {

	String name;
	int badge;
	
	PoliceOfficer(String n , int b ){
		this.name = n;
		this.badge = b;
	}
	
	public String getName(){
		return this.name;
		
	}
	
	public int getBadge(){
		return this.badge;
		
	}
	
	public void issueTicket( boolean x, ParkedCar c, ParkingMeter m){
		if ( x){
			

			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("Officer: " + this.name);
			System.out.println("Badge Number: "+ this.badge);
			
			
			ParkingTicket tick = new ParkingTicket();
			tick.Ticket(c, m);
		}
		else {
			System.out.println("No ticket necessary");
		}
	}
	
}
