
public class Weather {

private WeatherState state = new RainState();


public void precipState() {
	state.precip(this);
}

public void condenseState() {
	state.condense(this);
}

public void evapState() {
	state.evap(this);
}

public void setState(RainState rainState) {
	// TODO Auto-generated method stub
	
}

public void setState(SleetState sleetState) {
	// TODO Auto-generated method stub
	
}

public void setState(ClearSkyState clearSkyState) {
	// TODO Auto-generated method stub
	
}


}
