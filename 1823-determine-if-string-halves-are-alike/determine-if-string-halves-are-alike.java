class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String onehalf=s.substring(0,n/2).toLowerCase();
        String secondhalf=s.substring(n/2).toLowerCase();
        int count=0;
        int counts=0;
        for(int i=0;i<onehalf.length();i++){
            if(onehalf.charAt(i)=='a' || onehalf.charAt(i)=='e' || onehalf.charAt(i)=='i' || onehalf.charAt(i)=='o' || onehalf.charAt(i)=='u'){
                count++;
            }
        }
        for(int i=0;i<secondhalf.length();i++){
            if(secondhalf.charAt(i)=='a' || secondhalf.charAt(i)=='e' || secondhalf.charAt(i)=='i' || secondhalf.charAt(i)=='o' || secondhalf.charAt(i)=='u'){
                counts++;
            }
        }
        if(count==counts){
            return true;
        }
        return false;
    }
}