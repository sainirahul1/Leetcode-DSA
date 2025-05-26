class Solution {
    public String triangleType(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
              if(arr[0]+arr[1]<=arr[2]||arr[1]+arr[2]<=arr[0] || arr[0]+arr[2]<=arr[1]){
                return "none";
              }
              if(arr[0]==arr[1] && arr[1]==arr[2]){
                return "equilateral";
              }
              else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[0]==arr[2]){
                return "isosceles";
              }
              else{
                return "scalene";
              }
        }
        return "none";
    }
}