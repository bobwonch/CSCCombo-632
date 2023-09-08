import java.util.Scanner;

public class InputCheckSheet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
//		System.out.print("Enter a word here: ");
//		word = input.next();
//
//		System.out.print("Enter an integer here: ");
//		intNum = input.nextInt();
//		
		System.out.print("Enter a real number here: ");
		realNum = input.nextFloat();
		
		realNum = 9876543210001233333333333378678719876.987654367867867871f;
		
		realNum = realNum + realNum;
	
		System.out.printf("$%.9f",realNum);
		
//		System.out.print("Enter a double here: ");
//		biggerRealNum = input.nextDouble();
//		biggerRealNum = biggerRealNum + biggerRealNum;
//		System.out.printf("$%.9F", biggerRealNum);
		
//		System.out.print("Enter a single character here: ");
//		letter = input.next().charAt(0);
//		
//		System.out.println("Word: " + word + "\nInt: " + intNum 
//				+ "\nFloat: " + realNum + "\nDouble: " + biggerRealNum
//				+ "\nLetter: " + letter);
	}

}
