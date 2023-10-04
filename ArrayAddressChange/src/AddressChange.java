
public class AddressChange {
	// function that reverses array and stores it
		// in another array
		static int[] reverse(int a[], int n)
		{
			int[] b = new int[n];
			int j = n;
			for (int i = 0; i < n; i++) {
				b[j - 1] = a[i];
				j = j - 1;
			}
			return b;// printing the reversed array		
		}

		public static void main(String[] args)
		{
			int [] arr = {10, 20, 30, 40, 50};
	      System.out.println("Array is: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	      System.out.println("It's memory address is: " + arr +  "\n");
			arr = reverse(arr, arr.length);
	      System.out.println("Reversed array is:");
	      for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	      System.out.println("It's memory address is: " + arr +  "\n");
		}

}
