class Solution {
    public int differenceOfSums(int n, int m) {
        int totalsum=(n*(n+1)/2);
        int sumnot=0;
        for(int i=1;i<=n;i++){
          if(i%m!=0){
            sumnot+=i;
          }
        }
        int rem=totalsum-sumnot;
        return sumnot-rem;
    }
}