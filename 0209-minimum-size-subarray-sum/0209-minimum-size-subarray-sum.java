class Solution {
    public int minSubArrayLen(int target, int[] nums) {
   int window=0, j=0,ans=Integer.MAX_VALUE;
   for(int i=0;i<nums.length;i++)
   {
    window += nums[i];
    while(window>=target)
    {
        ans=Math.min(ans,i-j+1);
        window -= nums[j];
        j++;
    }
   }
   return  ans == Integer.MAX_VALUE ? 0 : ans;
    }
}