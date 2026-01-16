class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String res="";
        String finals="";
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                   res=s.substring(i,j);
                   int count=0;
                   int m=res.length();
                   for(int p=0;p<res.length();p++){
                       if(res.charAt(p) == '1' ){
                          count++;
                       }
                   }
                       if (count == k) {
                    if (res.length() < minlength ||
                       (res.length() == minlength && res.compareTo(finals) < 0)) {
                        minlength = res.length();
                        finals = res;
                    }
            }
            }
        }
        return finals;
    }
}