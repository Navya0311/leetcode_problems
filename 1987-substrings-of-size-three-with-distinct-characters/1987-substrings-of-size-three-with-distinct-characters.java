class Solution {
    public int countGoodSubstrings(String s) {
       char c[]=s.toCharArray();
       int count =0;
       for(int i=0;i<c.length-2;i++)
       {
        if(c[i]!=c[i+1]&&c[i+1]!=c[i+2]&&c[i+2]!=c[i])
        count++;
       }
       return count;
    }
}