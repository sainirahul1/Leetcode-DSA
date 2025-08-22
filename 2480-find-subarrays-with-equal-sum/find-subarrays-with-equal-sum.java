class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=1;i<nums.length;i++){
         sum=nums[i-1]+nums[i];
         if(set.contains(sum)){
            return true;
         }
         set.add(sum);
        }
        return false;
    }
}