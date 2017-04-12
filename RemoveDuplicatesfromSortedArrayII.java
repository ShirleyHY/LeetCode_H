/*public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<3) return nums.length;
        if (nums.length==3){
            if(nums[2]>nums[0])
            return 3;
            else return 2;
        }
        int count=2;
        for(int i=2; i<nums.length-1; i++){
            if(nums[i]>nums[i-2]){
                count++;
            }
            else
                if(nums[i]==nums[i-2] && nums[i+1]>nums[i]){
                nums[count++]=nums[++i];
                if(count==nums.length-1||i==nums.length-1) return count+1;
                nums[count++]=nums[i+1];
                }  
        }
        return count+1;
    }
}想得太复杂。搞来搞去总是有漏洞，还不如最开始最简单的想法
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<3) return nums.length;
        int count=1;
        for(int i=2; i<nums.length; i++){
            if(nums[i]==nums[count] && nums[i]==nums[count-1])  continue;
            else{
                count++;
                nums[count]=nums[i];
            }  
        }
        return count+1;
    }
}//最简单的想法。但是速度很慢


public class Solution {
    public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int n : nums) //相当于for (int n =0; n < nums.length; n++)
        if (i < 2 || n > nums[i-2])
            nums[i++] = n;
    return i;
    }
}//好好琢磨
