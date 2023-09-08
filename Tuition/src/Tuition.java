import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		
		System.out.println("How many credits are you taking?");
		int creds = input.nextInt();
		if(creds > 12)
		{
			total += 250;
		}
		else
		{
			System.out.println("Will you be doing activities? y/n");
			String ans = input.next();
			if(ans.equals("y"))
			{
				total +=250;
			}
		}
		total += (creds * 580) + 650;
		System.out.println("The total tuition is: " + total);
		
	}

}
