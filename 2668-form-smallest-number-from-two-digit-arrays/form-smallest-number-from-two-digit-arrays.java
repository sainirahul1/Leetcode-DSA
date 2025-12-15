class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    return nums1[i];
                }
            }
        }
        String res="";
        res+=nums1[0];
        res+=nums2[0]; 
        int ans=Integer.parseInt(res);
        char[] digits=String.valueOf(ans).toCharArray();
        Arrays.sort(digits);
        int result=Integer.parseInt(new String(digits));
        return result;
    }
}