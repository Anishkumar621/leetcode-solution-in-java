class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first =strs[0];
        String last = strs[strs.length-1];
        int i=0;
        while(first.length()>i && last.length()>i && first.charAt(i) == last.charAt(i))
        {
            i++;
        }
        return first.substring(0,i);
    }
}