package example1;

public class Application {

	public static void main(String[] args) {
		
		Passanger p_1 = new Passanger("Tatiana");
		Passanger p_2 = new Passanger("Vovan");
		Passanger p_3 = new Passanger("Nicolae");
		
		
		//b.passangers = new Bus.Passanger[3];
		// 1) empty bus
		
		Bus bus = new Bus("108");
		
		// 2) Station A
		Station station_a = new Station("Doina");
		
		// + 3 passangers ---- > bus
//		bus.setPassanger(0, p_1);
//		bus.setPassanger(3, p_2);
//		bus.setPassanger(4, p_3);
		
		p_1.enterBus(bus, station_a, 0);
		p_2.enterBus(bus, station_a, 3);
		p_3.enterBus(bus, station_a, 4);
		
		System.out.println( bus );
		
		Station station_b = new Station("Durlesti");
						
		// 3) Station B   <==== bus 3 passangers
		
		p_1.exitBus(station_b);
		p_2.exitBus(station_b);
		p_3.exitBus(station_b);
		
		System.out.println( bus );
		System.out.println( station_b );
		
		

	}

}
