class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){return false;}
        if(s.equals(goal)){
            return true;
        }
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        for(int i=0;i<sb.length();i++){
            char a=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(a);
            if(sb.toString().equals(goal)){
               // return true;
                c=1;
            }
            }
            if(c==1){
                return true;
            }
        return false;
    }
}