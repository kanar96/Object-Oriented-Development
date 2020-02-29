public class ClearSkyState implements WeatherState {
 
 
	public void precip(Weather w) {
		System.out.println("The weather is beautful.");
		
	}


	public void condense(Weather w) {
		w.setState(new SleetState());
		
	}

	
	public void evap(Weather w) {
		
		
	}

}