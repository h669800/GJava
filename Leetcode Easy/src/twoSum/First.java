package twoSum;

import java.util.Arrays;

class First {
		public static void main(String[] args) {
			int[] nums = {2,7,11,15};
			int target = 9;
			System.out.println(Arrays.toString(twoSum(nums, target)));
		}
	    public static int[] twoSum(int[] nums, int target) {
	        int[] ans;
            int[] and;
	        ans = new int[2];
            and = new int[2];
        for (int i = 0; (ans[0] + ans[1]) != target; i++) {
            for (int j = 0; j != nums.length - 2 || ans[0] + ans[1] != target ; j++) {
                ans[0] = nums[i];
                ans[1] = nums[j];
                and[0] = i;
                and[1] = j;
            }
        }
	        return and;
	    }
	}
	


