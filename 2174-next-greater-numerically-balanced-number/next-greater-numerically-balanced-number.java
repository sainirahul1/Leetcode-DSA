class Solution {
    public int nextBeautifulNumber(int n) {
        int ans=0;
        n=n+1;
        while(n>0){
         if(isbalanced(n)){
           ans=n;
           break;
         }
         else{
            n=n+1;
         }
        }
        return ans;
    }
    public boolean isbalanced(int num){
        int n=num;
        Map<Integer,Integer> mp=new HashMap<>();
        while(n>0){
            int digit=n%10;
            mp.put(digit,mp.getOrDefault(digit,0)+1);
            n/=10;
        }
        n=num;
        while(n>0){
            int digit=n%10;
            if(mp.get(digit)!=digit){
                return false;
            }
            n/=10;
        }
        return true;
    }
}