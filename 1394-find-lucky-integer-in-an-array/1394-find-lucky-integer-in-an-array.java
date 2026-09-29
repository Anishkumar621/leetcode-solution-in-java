class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];

        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        for(int j = count.length - 1; j >= 1; j--)
        {
            if(count[j] == j)
                return j;
        }

        return -1;
    }
}