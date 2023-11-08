
public class Person {
	private String fName;
	private String lName;
	private int age;
	private double heightInches;
	private int feet;
	private int inches;
	private Car newCar;
	
	
	
	public Person(String fName, String lName, int age, double heightInches) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.heightInches = heightInches;
		newCar = new Car();
	}
	
	/////Getters and Setters////////
	
	public Car getCar() {
		return newCar;
	}

	public void setNewCar(Car newCar) {
		this.newCar = newCar;
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeightInches() {
		return heightInches;
	}
	
	public void setHeightInches(double heightInches) {
		this.heightInches = heightInches;
	}
	
	@Override
	public String toString() {
		return "Hi " + fName + " looks like you are "  
				+ age + " years old and " +  heightInches
				+ " inches tall!";
	}
	
	
}
