
public class FindValue {

	public static void main(String[] args) {
		int[]nums = {1,2,3,4,5,6};
		int num = 1;
		if(FindValue(nums,num)) {
			System.out.println(num + " is in the array.");
		}else
		{
			System.out.println(num + " is not in the array.");
		}

	}

	private static boolean FindValue(int[] nums, int num) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	

}
