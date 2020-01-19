abstract class Cake_Filling implements cake {
	
	protected cake tempCake;
	
	public Cake_Filling(cake newCake) {
		
		tempCake = newCake;
		
	}
	
	public String getDescription() {
		
		return tempCake.getDescription();
	}
	
	public double  getCost() {
		return tempCake.getCost();
	}
}
