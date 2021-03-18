package Mars;

public class Weight {
	
	private double weightInEarth;
	private double weightInMars;
	
	public Weight()
	{
		this.weightInEarth = 44.5;
		this.weightInMars = 0;
	}
	
	public Weight(double weightInEarth)
	{
		this.weightInEarth = weightInEarth;
	}

	public double getWeightInEarth() {
		return weightInEarth;
	}

	public void setWeightInEarth(double weightInEarth) {
		this.weightInEarth = weightInEarth;
	}

	public double getWeightInMars() {
		return weightInMars;
	}
	/*
	public void setWeightInMars(double weightInMars) {
		this.weightInMars = weightInMars;
	}
	*/
	public void calculateWeightInMars()
	{
		weightInMars = (weightInEarth * 9.81) / 3.711;
	}
	

}
