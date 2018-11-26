package example1;

import java.util.Arrays;

public class Station {
	
	private String station_name;
	private Passanger[] passangers;
	
	public Station(String station_name){
		this.station_name = station_name;
		this.passangers = new Passanger[5];
	}
	
	//open doors
	public void setPassanger(Integer seat, Passanger p){
		this.passangers[seat] = p;
	}
	
	@Override
	public String toString() {
		return "Station [" + station_name + "]\n" 
				+ Arrays.toString(passangers).replaceAll(",", "\n") + "]\n";
	}
	

}
