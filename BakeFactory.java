package com.Bake;

public class BakeFactory {

	public Flavor getInstance(String string)
	{
		if(string.equals("Open"))
			return new Chocolate();
		else if(string.equals("Closed"))
			return new Vanilla();
		else
			return new Strawberry();
	}

}
