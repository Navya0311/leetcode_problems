class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> set=new HashMap<>();
        int max=0;
        int res=0;
        for(int i:nums)
        {
            set.put(i,set.getOrDefault(i,0)+1);
            if(set.get(i)>max)
            {     res=i;
                max=set.get(i);
            }
        }
        return res;
    }
}