
public class Car {
	private String color;
	private int mileage;
	private double amtOfGas;
	private SteeringWheel sWheel;
	
	private Wheel[] wheels;
	
	//Constructors
	
	public Car() {
		color = "white";
		mileage = 1000;
		amtOfGas = 30.0;
		int numWheels = 4;
		wheels = new Wheel[numWheels];
		sWheel = new SteeringWheel(22, "wood");		
		setWheels(22, "Wood");
	}
	public Car(String color, int mileage, double amtOfGas, int numWheels) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheels = new Wheel[numWheels];
		sWheel = new SteeringWheel(22, "wood");
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmtOfGas() {
		return amtOfGas;
	}

	public void setAmtOfGas(double amtOfGas) {
		this.amtOfGas = amtOfGas;
	}

	public int getMileage() {
		return mileage;
	}
	public Wheel[] getWheels() {
		return wheels;
	}


	public void setWheels(int radius, String material) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel(radius, material);
		}
		
	}


	public void drive(int milesDriven) {
		mileage += milesDriven;
		amtOfGas -= milesDriven/17;
	}
	
	@Override
	public String toString() {
		Wheel[] wls = getWheels();
		return "Car color =" + color 
				+ ", mileage = " + mileage 
				+ ", Amout of gas =" + amtOfGas 
				+ ", Wheel size:" + wls[0].getRadius() 
				+ ", Wheel material: " +wls[0].getMaterial()
				+ ", and Steering wheel material: " + sWheel.getMaterial();
	}

	
	
	

}
