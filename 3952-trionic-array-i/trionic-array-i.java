class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4){
            return false;
        }
       boolean cond1=false;
       boolean cond2=false;
       boolean cond3=false;

        int i=0;
       while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        cond1=true;
       } 
       while(i<n-1 && nums[i]>nums[i+1]){
            i++;
        cond2=true;
       } 
       while(i<n-1 && nums[i]<nums[i+1]){
            i++;
        cond3=true;
       } 
        if(i!=n-1){
            return false;
        }
        return cond1 && cond2 && cond3;
    }
}