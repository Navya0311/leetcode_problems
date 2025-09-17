class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0,i=0,j=0;
        while(i<m&&j<n)
        {
            if(g[i]<=s[j])
            {
                cnt++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
           
        }
         return cnt;
    }
}