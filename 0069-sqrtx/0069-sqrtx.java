class Solution {
    public int mySqrt(int x) {
       int hi=x;
       int lo=0;
       while(lo<=hi)
       {
        int mid = lo + (hi-lo)/2;
        if((long)mid*mid <=x)
        {
            lo=mid+1;
        }
        else
        {
            hi=mid-1;
        }
       } 
       return lo-1;
    }
}