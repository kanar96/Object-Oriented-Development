
public class SleetState {


  
    public void precip(Weather w) {
        w.setState(new ClearSkyState());
    }

    public void condense(Weather w) {
        w.setState(new RainState());
    }
 

    public void evap() {
        System.out.println("Weather is clear.");
    }
}

