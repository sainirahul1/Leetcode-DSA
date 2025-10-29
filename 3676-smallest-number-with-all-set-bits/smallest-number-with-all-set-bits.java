class Solution {
    public int smallestNumber(int n) {
        int ans=0;
        while(n>0){
            if(issetbit(n)){
                ans=n;
                break;
            }
            else{
                n=n+1;
            }
        }
        return ans;
    }
    public boolean issetbit(int n){
        String binaryInteger=Integer.toBinaryString(n);
        if(binaryInteger.matches("1+")){
            return true;
        }
        return false;
    }
}