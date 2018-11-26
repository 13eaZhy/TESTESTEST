package example1;

import java.util.Arrays;

public class Bus {
	
	private String route_name;
	private Passanger[] passangers;
	
	
	public Bus(String route_name){
		this.route_name = route_name;
		this.passangers = new Passanger[10];
	}
	
	public void setPassanger(Integer seat, Passanger p){
		this.passangers[seat] = p;
	}

	@Override
	public String toString() {
		return "Bus " + "[" + route_name + "] \n" + Arrays.toString(passangers).replaceAll(",","\n");
	}
	
	public Integer getPassangerIndex(Passanger p){
		return Arrays.binarySearch(this.passangers, p); // cauta locul pasagerului in bus
	}

		
	

}
