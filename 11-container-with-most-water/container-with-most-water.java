class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxparea=0;
        int p1=0;
        int p2=n-1;
        while(p1<p2){
                int w=p2-p1;
                int h=Math.min(height[p1],height[p2]);
                int maxarea=w*h;
                if(maxarea>maxparea){
                    maxparea=maxarea;
                }
                if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
         return maxparea;
    }
}