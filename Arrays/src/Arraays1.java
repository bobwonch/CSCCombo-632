import java.util.Scanner;

public class Arraays1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many words would you like to store?");
		int num = input.nextInt();
		String[] strgs = new String[num];
		System.out.println(strgs.length);
		
		System.out.println(strgs.toString());
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter a single word:");
			strgs[i] = input.next();
			
		}		 
	}

}
