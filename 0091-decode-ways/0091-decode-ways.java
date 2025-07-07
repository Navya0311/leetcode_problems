class Solution {
    public int numDecodings(String s) {
           Integer dp[]=new Integer[s.length()];
        if(s.length()==0)
        {
            return 0;
        }
        else
        {
         return helper(s,0,dp);
        }
    }
    public static int helper(String s,int p,Integer []mem)
    {
        int n=s.length();
     
        if(p==n)
        {
            return 1;
        }
        if(s.charAt(p)=='0')
        {
            return 0;
        }
        if(mem[p]!=null)
        {
            return mem[p];
        }
        int res=helper(s,p+1,mem);
        if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7'))
        {
            res=res+helper(s,p+2,mem);
        }

        return mem[p]=res;
    }
}