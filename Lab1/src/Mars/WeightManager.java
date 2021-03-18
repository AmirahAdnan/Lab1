package Mars;

import java.util.ArrayList;
import java.util.List;


public class WeightManager extends Weight {
	
	public List<Weight> selectWeight()
	{
		
		// An object to store a list of product
		List<Weight> weights = new ArrayList<Weight>();
		
		try {
			
				// Wrap a record into an object
				Weight weight = new Weight();
				
				// Add into the list
				weights.add(weight);
			}
	catch (Exception ex)
	{
		ex.printStackTrace();
	}
		return weights;
	}
}
