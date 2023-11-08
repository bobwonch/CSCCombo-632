
public class Cat extends Animal{
	private String color;

	
	public Cat(double length, double heigth, String color) {
		super(length, heigth);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public boolean equals(Cat cat) {
		if( this.getLength() == cat.getLength() &&
				this.getHeigth() == cat.getHeigth() &&
				this.color.equals(cat.color)) return true;
		return false;
	}
	

	@Override
	public String makeNoise() {
		return "Meow, Meow!";
	}

	@Override
	public String toString() {
		return "Cat";
	}
	
	
}
