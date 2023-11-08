
public class Dog extends Animal{
	private boolean drool;
	public Dog(double length, double heigth, boolean drool) {
		super(length, heigth);
		this.drool = drool;
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isDrool() {
		return drool;
	}


	public void setDrool(boolean drool) {
		this.drool = drool;
	}


	@Override
	public String makeNoise() {
		return " Woof, Woof!";
	}
	
	@Override
	public String toString() {
		return "Dog";
	}

	

}
