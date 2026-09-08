class Solution {
    public int singleNonDuplicate(int[] nums) {
       int pro =0;
        for(int i=0;i<nums.length;i++)
        {
            pro ^=nums[i];
        }
        return pro;
    }
}