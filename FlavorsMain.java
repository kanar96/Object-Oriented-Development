import com.Bake.Flavor;
import com.Bake.BakeFactory;
import com.Bake.Chocolate;
import com.Bake.Vanilla;
import com.Bake.Strawberry;
import com.Bake.BakeFactory;


public class FlavorsMain {

	public static void main(String a[]) {
		
		BakeFactory bf = new BakeFactory();
		Flavor obj = bf.getInstance("");
		obj.spec();
	}
	}


