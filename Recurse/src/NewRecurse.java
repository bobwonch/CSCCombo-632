
public class NewRecurse {

	static long[] fibArray;
	public static void main(String[] args) {
		int term = 50;
		fibArray = new long[term + 1];
		
		for(int i = 0; i < 2; i ++) {
			fibArray[i] = i;
		}
		//factorial(5);
		//counting(5);
		
		System.out.println(fib(term));
		for(long i = 0; i < fibArray.length; i++) {
			if(i%7 == 0)System.out.println();
			System.out.print(fibArray[(int) i] + " ");
			
		}
	}

	private static long fib(int n) {
		if(n == 0 || n == 1)return n;
		if(fibArray[n] != 0) {
			return fibArray[n];
		}
		long nthFibNum = fib(n-1)+fib(n-2);
		fibArray[n] = nthFibNum;
		return nthFibNum;		
	}

	private static int factorial(int n) {
		if(n==0)return 1;		
		int product = n * factorial(n-1);
		System.out.println(product);
		return product;
	}
	private static void counting(int n) {
		if(n==0) {
			System.out.println(0);
		}else
		{
			System.out.println(n);
		 	counting(n-1);
		 	System.out.println(n);
		}
	}
	
	

	
}
