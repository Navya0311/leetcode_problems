class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int n=points.length;
        int arrows=1;
        int prev=points[0][1];
        for(int i=0;i<n;i++)
        {
            if(points[i][0]>prev)
            {
                arrows++;
                 prev=points[i][1];
            }
           
        }
        return arrows;
    }
}