
public class Animal {

	private double length;
	private double heigth;
	
	public Animal(double length, double heigth) {
		super();
		this.length = length;
		this.heigth = heigth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public boolean equals(Animal anim) {
		if(this.length == anim.length && this.heigth == anim.heigth) return true;
		return false;
		
	}
	public String makeNoise() {
		return "Blah, Blah, Blah";
	}
	public String makeNoise(String noise) {
		return noise + " " + noise + " " + noise + " ";
	}
	@Override
	public String toString() {
		return "Animal";
	}

	
	
	
}
