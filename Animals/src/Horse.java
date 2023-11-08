
public class Horse extends Animal{

	private double speed;

	public Horse(double length, double height, double speed) {
		super(length, height);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String makeNoise() {
		return "Naaay, naaaaay!";
	}
	
	@Override
	public String toString() {
		return "Horse";
	}
	
	
}
