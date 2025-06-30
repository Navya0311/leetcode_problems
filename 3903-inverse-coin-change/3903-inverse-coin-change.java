class Solution {
    public List<Integer> findCoins(int[] numWays) {
        int n=numWays.length;
    List<Integer>res=new ArrayList();
    int [] dp=new int[n+1];
    dp[0]=1;
    for(int i=0;i<n;i++)
    {
        if(numWays[i]>0&&numWays[i]-1==dp[i+1])
        {
            res.add(i+1);
            for(int j=i+1;j<=n;j++)
            {
                dp[j]=dp[j]+dp[j-(i+1)];
            }

        }
        if(numWays[i]!=dp[i+1])
        {
            List<Integer> l=new ArrayList();
        return l;
        }
    }
       return res; 
    }
}