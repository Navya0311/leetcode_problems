class Solution {
    char ans='a';
    public  void appendi(String s,int k)
    {
        if(s.length()>=k)
        {
            ans=s.charAt(k-1);
            return;
        }
        String x="";
        for(int i=0;i<s.length();i++)
        {
            x=x+(char)(s.charAt(i)+1);
        }
        appendi(s+x,k);
    }
    public char kthCharacter(int k) {
        appendi("a",k);
           return ans; 
    }
}