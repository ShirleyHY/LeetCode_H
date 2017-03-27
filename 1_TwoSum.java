public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(); //Map容器将key与value一一映射。本质来说就是将数组的下标和值对调了。
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
