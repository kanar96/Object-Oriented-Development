public class RainState implements WeatherState {
 
   

	public void precip(Weather w) {
		System.out.println("It might be raining, but at least there is no sleet!");
		
	}

	public void condense(Weather w) {
		System.out.println("The weather is something");		
	}

	
	public void evap(Weather w) {
		System.out.println("No ");	
		
	}
}