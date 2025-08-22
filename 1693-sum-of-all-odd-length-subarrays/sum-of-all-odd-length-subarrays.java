class Solution {
    int ans=0;
    public int sumOddLengthSubarrays(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                if((j-i+1)%2!=0){
                    for(int k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                     ans+=sum;
                }
            }
        }
        return ans;
    }
}