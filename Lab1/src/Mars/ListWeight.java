package Mars;

import java.util.List;

public class ListWeight {

	public static void main(String[] args) {

		System.out.println("\nA list of product in the cafe\n");
		
		// Get a list of product
		WeightManager weightMgr = new WeightManager();
		List<Weight> weights = weightMgr.selectWeight();
		
		// Display a list of products
		for (Weight weight:weights)
		{
			System.out.println("Weight in the Earth       : " + weight.getWeightInEarth());
			System.out.println();
		}

	}

}
