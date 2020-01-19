public class BakeCake{
	
	public static void main(String[] args) {
		
		cake basicCake = new chocolate(new vanilla(new cake_plain()));
		
		System.out.println("Ingredients: " + basicCake.getDescription());
		System.out.println("Price: " + basicCake.getCost());
	}
}
