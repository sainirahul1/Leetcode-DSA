class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        while(n>2){
            String res="";
        for(int i=1;i<n;i++){
            int curr=Character.getNumericValue(s.charAt(i));
            int prev=Character.getNumericValue(s.charAt(i-1));
            int ans=(prev+curr)%10;
            res+=ans;
        }
        s=res;
        n=s.length(); 
        }
        if(s.charAt(0)==s.charAt(1)){
            return true;
        }
        return false;
    }
}