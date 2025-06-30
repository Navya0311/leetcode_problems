class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashSet<Character> res=new HashSet<>();
      for(char c:jewels.toCharArray())
      {
        res.add(c);
      }
      int count=0;
      for(char c:stones.toCharArray())
      {
        if(res.contains(c))
        {
            count++;
        }
      }
      return count;
    }
}