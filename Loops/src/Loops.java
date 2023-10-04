
public class Loops {

	
	public static void main(String[] args) {
		int MAX = 6 ;
		for (int i = 0; i < MAX; i ++) {
			if(i%2==0) {
				for(int j = 0; j < MAX; j++)
				{
					System.out.print("*");
				}
			}else 
			{
				for(int k = 0; k < MAX; k+=2)
				{
					System.out.print("*");
					System.out.print(" ");
					
				}
			}
			
			System.out.println();
		}

	}

}
