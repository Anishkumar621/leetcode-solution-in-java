class Solution {
    public String greatestLetter(String s) {
     HashMap<Character,Integer> map = new HashMap<>();
     for(char ele : s.toCharArray())   
     {
        map.put(ele,1);
     }
     char res =' ';
     for(char ele : s.toCharArray())
     {
        if(ele >= 'a' && ele <='z')
        {
            char up = (char)(ele-32);
            if(map.containsKey(up))
            {
                if(up>res)
                res =up;
            }
        }
     }
     if(res == ' ') return "";
     else return String.valueOf(res);
    }
}