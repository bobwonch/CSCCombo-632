
public class CodingBats {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 1 };
		int[] retArr = new int[nums.length];
		// post4([2, 4, 1, 2])
		// System.out.println(either24(nums));
		// System.out.println(makeBricks(3,0,12));
//		retArr = zeroMax(nums);
//		for (int i = 0; i < retArr.length; i++) {
//			System.out.println(retArr[i]);
//		}

		System.out.println(canBalance(nums));

	}

	public static boolean canBalance(int[] nums) {
		int lSum = 0;

		for (int i = 0; i < nums.length; i++) {
			lSum += nums[i];
			int rSum = 0;
			for (int j = nums.length - 1; j > i; j--) {
				rSum += nums[j];
			}
			if (rSum == lSum)
				return true;
		}
		return false;
	}

	public static int[] zeroMax(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int numi = nums[i];
			if (nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					int numj = nums[j];
					if (nums[j] % 2 != 0 && nums[j] > max) {
						nums[i] = nums[j];
						max = nums[j];
					}
				}
			}
		}
		return nums;
	}

	public static int[] zeroFront(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (num == 0)
				count++;
		}

		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				continue;
			res[count] = nums[i];
			count++;
		}

		return res;
	}

	public static int[] post4(int[] nums) {
		int i;
		int j = 0;
		int[] retArr = null;
		for (i = nums.length - 1; i > 0; i--) {
			if (nums[i] == 4) {
				retArr = new int[j];
				for (int k = 0; k < retArr.length; j++) {
					retArr[k] = nums[i];
				}
			}
			j++;
		}

		return retArr;
	}

	public static boolean makeBricks(int small, int big, int goal) {
		if (small + big * 5 < goal || goal % 5 > small)
			return false;
		return true;

	}

	public static boolean either24(int[] nums) {
		boolean isGood = false;
		for (int i = 0; i < nums.length - 1; i++) {
			int num1 = nums[i];
			int num2 = nums[i + 1];
			if (num1 == 2 && num2 == 2) {
				isGood = true;
				for (int j = i; j < nums.length - 1; j++) {
					if (nums[j] == 4 && nums[j + 1] == 4)
						isGood = false;
				}
			}
		}
		for (int i = 0; i < nums.length - 1; i++) {
			int num1 = nums[i];
			int num2 = nums[i + 1];
			if (num1 == 4 && num2 == 4 && i != nums.length - 1) {
				isGood = true;
				for (int j = i; j < nums.length - 1; j++) {
					if (nums[j] == 2 && nums[j + 1] == 2)
						isGood = false;
				}
			}
		}
		return isGood;
	}

}
