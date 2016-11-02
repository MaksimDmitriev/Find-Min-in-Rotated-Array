package rotated;

public class Main {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, -7, -6, -5, -4, -3 };
		System.out.println(getMinInRotatedArray(a));
		System.out.println(getMinInRotatedArray2(a));
	}

	public static int getMinInRotatedArray2(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;

		int i = 0;
		int j = nums.length - 1;

		while (i <= j) {
			// Sorted (sub)array
			if (nums[i] <= nums[j])
				return i;

			int m = (i + j) / 2;

			if (nums[m] >= nums[i]) {
				i = m + 1; // The pivot is in right subarray
			} else {
				return m;
			}
		}
		return -1;
	}

	public static int getMinInRotatedArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;

		int i = 0;
		int j = nums.length - 1;

		while (i <= j) {
			// Sorted (sub)array
			if (nums[i] <= nums[j])
				return i;

			int m = (i + j) / 2;

			if (nums[m] >= nums[i]) {
				i = m + 1; // The pivot is in right subarray
			} else {
				j = m; // We are in the pivot index
			}
		}
		return -1;
	}

}
