package ParkingTicket;
import java.util.Scanner;

public class ParkingTicket {

	public void Ticket(ParkedCar car, ParkingMeter met){
		
		double timeLeft = car.minsParked - met.minsPurchased;
		double extra = timeLeft / 60;
		double fee = 25.00;
		
		if ( extra <= 1){
			//Ticket fee is 25 
		 fee = 25.00;
		}
		else{
	     fee = 25.00 + (extra *10);
			
		}
			
			System.out.println("Ticket For....");
			System.out.println("Car Make: "+car.carMake);
			System.out.println("Car Model: "+car.carModel);
			System.out.println("Car Color: "+car.carColor);
			System.out.println("Car Plate: "+car.plate);

			System.out.println("Total Minutes Parked: " +car.minsParked);
			System.out.println("Total Minutes Purchased: " + met.minsPurchased);
			System.out.println("Time Over: " + timeLeft);
			
			System.out.println("Total ticket price: " + fee);
			
			
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("Please enter your name officer: ");
		String name = reader.nextLine();
		
		System.out.println("Please enter your badge number: ");
		int badge = reader.nextInt();
		
		PoliceOfficer officer = new PoliceOfficer(name,badge);
		
		System.out.println("");
		
		System.out.println("Please enter a car make: ");
		String car = reader.nextLine();
		
		System.out.println("Please enter a car model: ");
		String model = reader.nextLine();
		
		System.out.println("Please enter a car color: ");
		String color = reader.nextLine();
		
		System.out.println("Please enter a car plate: ");
		String plate = reader.nextLine();
		
		System.out.println("Please enter a parked mins: ");
		int mins = reader.nextInt();
		
		System.out.println("Please enter mins purchased: ");
		int minsPur = reader.nextInt();
		
		ParkedCar trouble_car = new ParkedCar(car,model,color,plate,mins);
		ParkingMeter meter = new ParkingMeter(minsPur);
		
		if (trouble_car.minsParked > meter.minsPurchased){
			boolean issue = true;
			officer.issueTicket(issue, trouble_car, meter);	
		}
		else{
			boolean issue = false;
			officer.issueTicket(issue, trouble_car, meter);
				
		}
			
		
		}
		
	}
	

