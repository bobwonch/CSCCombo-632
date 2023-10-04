
public class Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 to 100");
		for(int i = 0; i < 100;i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%4d", i+ 1);
		}
		int multiplier = 1;
		for(int i = 1; i <= 10;i++){
			if(i % 10 == 0) {
				multiplier++;
			}
			System.out.printf("%4d", i * multiplier);
		}
			
	}

}
