import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            if (!set.contains(s.charAt(i))) {
                     set.add(s.charAt(i));
                } 
                else {
   
                         while (set.contains(s.charAt(i))) {
                         set.remove(s.charAt(start));
                         start++;
                        }
                 set.add(s.charAt(i));
    
                         
                    }

                count = i - start + 1;
                if (count > max) {
                    max = count;
                }
        }


   return max;
        
    }
}