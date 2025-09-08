class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int i=1;i<=n;i++){
            int a=i;
            int b=n-i;
            int sum=a+b;
            if(a>0 && b>0 && sum==n && isnozero(a) && isnozero(b)){
               arr[0]=a;
               arr[1]=b;
               //break;
            }
    // Integer[] res=arr.toArray(new Integer[0]);
        }
    return arr;
    }
    static boolean isnozero(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}