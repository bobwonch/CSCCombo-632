
public class Driver {

	public static void main(String[] args) {
		Person per = new Person("Bob", "Wonch", 52, 72);
		per.getCar().drive(50);
		//Car myCar = new Car();
//		Car yourCar = new Car("Red", 42, 22.0, 4);
//		
//		yourCar.setWheels(15, "Alloy");
		
//		System.out.println(yourCar.getColor());
//		System.out.println(yourCar.getAmtOfGas());
//		yourCar.setColor("Green");
//		yourCar.setAmtOfGas(30.0);;
//		System.out.println(yourCar.getColor());
//		System.out.println(yourCar.getAmtOfGas());
		
//		System.out.println(yourCar);
//		yourCar.drive(49);
//		System.out.println(yourCar);
//		
		Person bob = new Person("Bob","Wonch", 52, 72.0);
		bob.getCar().drive(60);
		System.out.println(bob.getCar());
		
		Wheel[] wheels = bob.getCar().getWheels();
		
		for (int i = 0; i < wheels.length-1; i++) {
			System.out.println(wheels[i + 1]);
		}
		for(Wheel wheel : wheels) {
			System.out.println(wheel);
		}
	}

}
