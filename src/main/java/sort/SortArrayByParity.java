package sort;

public class SortArrayByParity {

    /**
     * Given an integer array nums, move all the even integers at the beginning
     * of the array followed by all the odd integers.
     *
     * Example 1:
     *
     * Input: nums = [3,1,2,4]
     * Output: [2,4,3,1]
     * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     */

    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=0;
        int n=nums.length;

        while(right<n){
            if(nums[right]%2==0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            right++;
        }
        return nums;
    }
}
