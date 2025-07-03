class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<Integer>ans=new ArrayList<>();
         List<List<Integer>>res=new ArrayList<>();
         helper(0,nums,ans,res);
         return res;
        
    }
    public static void helper(int i,int nums[],List<Integer> res,List<List<Integer>>ans)
    {

        int n=nums.length;
        if(i==n)
        {
           ans.add(new ArrayList<>(res));
           return;
        }
         res.add(nums[i]);
        helper(i + 1, nums, res, ans);
        res.remove(res.size() - 1);
        helper(i + 1, nums, res, ans);
    }
}