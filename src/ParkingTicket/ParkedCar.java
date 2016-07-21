package ParkingTicket;
public class ParkedCar {

	String carMake,carModel, carColor, plate;
	int minsParked;
	
	
	ParkedCar(String make , String mod , String col, String pla, int mins ){
		
		this.carMake = make;
		this.carModel = mod;
		this.carColor = col;
		this.plate = pla;
		this.minsParked = mins;
	}
	
	public String getMake(){
		return this.carMake;
	}
	public String getModel(){
		return this.carModel;
	}
	public String getColor(){
		return this.carColor;
	}
	public String getPlate(){
		return this.plate;
	}
	
	public int getMins(){
		return this.minsParked;
	}
	
	
}
