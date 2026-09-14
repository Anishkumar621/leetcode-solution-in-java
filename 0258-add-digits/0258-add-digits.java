class Solution {
    public int addDigits(int num) {
        if(num==0)
        return 0;
        while(num>=10)
        {
            int sum=0;
            while(num>0)
            {
                int di=num%10;
                sum += di;
                num /= 10;
            }
            num =sum;
        }
        return num;
    }
}