package arrays;

public class SortColors {
    /**
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     * <p>
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     * <p>
     * You must solve this problem without using the library's sort function.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     */

    public void sortColors(int[] nums) {

        int zeroPos = 0;
        int twoPos = nums.length - 1;
        int i = 0;

        while (i <= twoPos) {
            if (nums[i] == 0) {
                swap(nums, zeroPos, i);
                i++;
                zeroPos++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, twoPos);
                twoPos--;
            }
        }

    }

    public void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }
}
