class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int count=0;
        int start=1;
        while(count<n){
        for(int i=0;i<7 && count<n;i++){
            sum+=start+i;
            count++; 
        }
        start++;
    }
  return sum;
}
}