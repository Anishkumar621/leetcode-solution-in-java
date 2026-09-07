class Solution {
    public int heightChecker(int[] heights) {
        int[] lastChecker=heights.clone();
        Arrays.sort(lastChecker);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=lastChecker[i])
            {
                count++;
            }
        }
        return count;
    }
}