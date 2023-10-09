
public class testRecus {

	private static long[] fibCache;
	public static void main(String[] args) {
		
		int n = 50;
		fibCache = new long[n +1];
		System.out.println(Fib(n));
		// System.out.println(result);
	}

	static long Fib(int n) {

		if(n<=1) {
			return n;
		}
		
		if(fibCache[n] != 0) {
			return fibCache[n];
		}
		
		long nthFibNum = Fib(n - 1) + Fib(n - 2);
		fibCache[n] = nthFibNum;
		
		return nthFibNum;
		
	}

}
