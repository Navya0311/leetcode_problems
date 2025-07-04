class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer> >ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        helper(1,n,k,ans,res);
        return ans;
       
    }
    public static void helper(int z,int n,int k,List<List<Integer>> ans,List<Integer> res)
    {
        if(res.size()==k)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int j=z;j<=n;j++)
        {
            res.add(j);
            helper(j+1,n,k,ans,res);
            res.remove(res.size() - 1);
        }
    }
}