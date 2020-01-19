public class chocolate extends Cake_Filling{

	public chocolate(cake newCake) {
		super(newCake);
		System.out.println("Adding Mix");
		System.out.println("Adding Chocolate");
	}
public String getDescription() {
		
		return tempCake.getDescription() + ", Chocolate";
	}
	
	public double  getCost() {
		return tempCake.getCost() + .50;
	}
}
