class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
       double maxdiagonallength=0;
    int maxarea=0;
     for(int i=0;i<dimensions.length;i++){
        int length=dimensions[i][0];
        int width=dimensions[i][1];
      double maxdiagonal=Math.sqrt((length*length)+(width*width));
        if(maxdiagonal>maxdiagonallength || maxdiagonal==maxdiagonallength && (length*width)>maxarea){
            maxdiagonallength=maxdiagonal;
            maxarea=length*width;
        }
}
return maxarea;
}
}