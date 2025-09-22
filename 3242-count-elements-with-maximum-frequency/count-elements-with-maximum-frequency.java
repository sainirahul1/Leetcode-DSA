class Solution {
    public int maxFrequencyElements(int[] nums) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++){
       mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
      }  
       int maxfreq=0;
       for(int num:mp.values()){
        if(num>maxfreq){
            maxfreq=num;
        }
       }
       int total=0;
       for(int num:mp.values()){
        if(num==maxfreq){
        total+=maxfreq;
        }
       }
       return total;
    }
}