import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            while(!s.empty()&&t[s.peek()]<t[i])
            {
                int p=s.pop();
                arr[p]=i-p;
            }
            s.push(i);
        }

        return arr;
    }
}