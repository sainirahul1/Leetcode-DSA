class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeroscount=0;
        int onescount=0;
        int twoscount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
             zeroscount++;
            }
            else if(nums[i]==1){
                onescount++;
            }
            else{
                twoscount++;
            }   
        }
        int index=0;
        while(zeroscount --> 0){
            nums[index++]=0;
        }
        while(onescount --> 0){
            nums[index++]=1;
        }
        while(twoscount --> 0){
            nums[index++]=2;
        }
    }
}