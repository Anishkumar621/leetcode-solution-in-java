class Solution {
    public static int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
           int n= x%10;
           rev = rev*10 + n;
           x/=10;
        }
        return rev;
    }
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int n=x;
       int rev= reverse(x);
        if(rev!=n)
        return false;
        return true;
    }
}