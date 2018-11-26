package example1;

public class Passanger {
	private String name;
	private Bus current_bus = null;
	
	public Passanger(String name){
		this.name = name;
	}
	
	public boolean enterBus( Bus b, Station s, Integer seat ){
		current_bus = b; // in curent bus retinem unde el o intrat
		b.setPassanger(seat, this);
		s.setPassanger(seat, null);
		return false;
	}
	
	public boolean exitBus(Station s){
		current_bus.setPassanger( current_bus.getPassangerIndex(this), null);
		s.setPassanger(0, this);
		return true;
	}

	@Override
	public String toString() {
		return "Passanger [name=" + name + "]";
	}
	
	
	public int compareTo(Object o){
		return this.name.equals( ( (Passanger)o).name)?0:1;
	}
	

}
