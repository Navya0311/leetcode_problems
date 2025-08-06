class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
        {
            return false;
        }
        int temp=x;
        int sum=0;int r=0;
        while(temp!=0)
        {
             r=temp%10;
             sum=sum*10+r;
             temp=temp/10;
             
        }
            return(x==sum);
       

    } 
}