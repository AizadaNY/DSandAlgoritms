import java.util.Map;

public class HashMap {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new java.util.HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp))
            {
                return new int [] { map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
