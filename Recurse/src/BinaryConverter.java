
public class BinaryConverter {

	public static void main(String[] args) {
		convertToBin(15);

	}

	private static void convertToBin(int n) {
		if(n == 0) {
			return;
		}		
		convertToBin(n/2);
		System.out.print(n%2);
		
	}

}
