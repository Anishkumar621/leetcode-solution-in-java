class Solution {
    public int smallestNumber(int n, int t) {
        while(true)
        {
            int m=n;
            int product=1;
            while(m>0){
            product*=m%10;
            m/=10;
            }
          if(product % t ==0)
          return n;
          n++;
        }
    }
}