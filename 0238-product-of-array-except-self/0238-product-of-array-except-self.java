class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suff = new int[nums.length];
        int[] pre = new int[nums.length];
        int suff1=1;
        int pre1=1;
        for(int i=0;i<nums.length;i++)
        {
            pre[i]=pre1;
            pre1 *=nums[i];
        }
         for(int i=nums.length-1;i>=0;i--)
        {
            suff[i]=suff1;
            suff1 *=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=pre[i] * suff[i];
        }
       return nums;
    }
}