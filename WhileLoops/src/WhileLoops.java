import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
//		int i = 5, num1 = 4, num2 = 3;
//		while(i>0) {
//			num2 = num2 * num1;
//			System.out.println("i: " + ", num2: " + num2);
//			i--;
//		}
//		System.out.println("Good Bye!");
/////////////////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		int age = -1;
		String name = "";
		System.out.println("Input your name:");
		name = input.next();
		while(age < 0)
		{
			System.out.println("Input your age:");
			age = input.nextInt();
		}
		System.out.println("Hello " + name + " I see you are " + age);
		
		int count = 3;
		while (count > 0)
		{
			System.out.println(count);
			count --;
		}
		System.out.println("Blast off~!");
	}

	
}
