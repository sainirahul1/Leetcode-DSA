class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int posindex=0;
        int negindex=1;
        for(int num:nums){
            if(num>=0){
                res[posindex]=num;
                posindex+=2;
            }
            else{
                res[negindex]=num;
                negindex+=2;
            }
        }
        return res;
    }
}