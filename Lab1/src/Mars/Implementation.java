package Mars;

import java.util.List;

//import Mars.*;

public class Implementation {

	public static void main(String[] args) {
		
		WeightManager weightMgr = new WeightManager();
		List<Weight> weights = weightMgr.selectWeight();
		
		for (Weight weight:weights)
		{
			weight.calculateWeightInMars(); 
			System.out.println ("Weight in the Earth : " + weight.getWeightInEarth() + "kg");
			System.out.print("Weight at Mars : " + weight.getWeightInMars()+ "kg");
		}	
	}
}
