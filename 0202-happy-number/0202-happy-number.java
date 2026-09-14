class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
        set.add(n);
        int sum =0;
       while(n>0)
       {
         int di= n % 10;
         sum += di*di;
         n /=10;  
       } 
       n= sum;
    }
    return n==1;
    }
}