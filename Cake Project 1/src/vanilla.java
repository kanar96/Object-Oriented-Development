public class vanilla extends Cake_Filling{

	public vanilla(cake newCake) {
		super(newCake);
	
		System.out.println("Adding Vanilla");
	}
public String getDescription() {
		
		return tempCake.getDescription() + ", Vanilla";
	}
	
	public double  getCost() {
		return tempCake.getCost() + .50;
	}
}
