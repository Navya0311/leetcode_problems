class Solution {
    public int countSubstrings(String s) {
        int cnt=0;
       for(int i=0;i<s.length();i++)
       {
        for(int j=i+1;j<=s.length();j++)
        {
            if(ispalin(s.substring(i,j)))
            {
                cnt++;
            }
        }
       }
       return cnt;
    }
    public boolean ispalin(String s) {
        
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}