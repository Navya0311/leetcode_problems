class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        int n = nums.length;
        int count = n / 3;
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            if(map.get(ele)==count+1)
            {
                ans.add(ele);
            }
        }
        return ans;
    }
}