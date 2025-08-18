class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int maxcount=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               continue;
            }
            else if(nums[i+1]==nums[i]+1){
                count++;
            }
            else{
            maxcount=Math.max(maxcount,count);
             count=1;
            }
        }
        maxcount=Math.max(maxcount,count);
        return maxcount;
    }
}