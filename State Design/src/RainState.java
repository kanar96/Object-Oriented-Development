public class RainState implements WeatherState {
 
   

	public void precip(Weather w) {
		w.setState(new SleetState());
		
	}

	public void condense(Weather w) {
		System.out.println("The weather is something");		
	}

	
	public void evap(Weather w) {
		System.out.println("No ");	
		
	}
}