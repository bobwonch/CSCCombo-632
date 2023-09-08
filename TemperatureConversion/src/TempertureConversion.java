import java.util.Scanner;

public class TempertureConversion {
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is temperature in fahrenheit?");
		
		double temp = input.nextDouble();
		
		double celsius = (temp - 32) * 5.0/9;
		
		double kelvin = celsius + 273.15;
		
		System.out.println("Fahrenhiet: " + temp);
		System.out.printf("Celsius :"+ celsius);
		System.out.printf("\nKelvin: %.2f", kelvin);
		
		
	}

}
