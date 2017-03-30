/*public class Solution {
    public int[] removeDuplicates(int[] nums) {
        int count=0;
        if (nums.length==0) return nums;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[count]) nums[++count]=nums[i];
        }
        int[] newnums=Arrays.copyOfRange(nums, 0,++count);
        return newnums;
    }
}
*/如果需要返回新数组
public class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        if (nums.length==0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[count]) nums[++count]=nums[i];
        }
        return ++count;
    }
}
