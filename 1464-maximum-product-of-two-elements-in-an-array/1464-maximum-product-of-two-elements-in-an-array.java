class Solution {
    public int maxProduct(int[] arr) {

        int last=Integer.MIN_VALUE;
       int sLast=Integer.MIN_VALUE;
       for(int num : arr)
       {
        if(num > last)
        {
            sLast=last;
            last=num;
        }
        else if(sLast < num )
        {
            sLast=num;
        }
       }
       return (last-1)*(sLast-1);
    }
}
