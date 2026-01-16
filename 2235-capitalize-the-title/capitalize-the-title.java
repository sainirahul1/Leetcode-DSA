class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            if(word.length()>2){
               word=Character.toUpperCase(word.charAt(0))+word.substring(1);
            }
            sb.append(word);
             sb.append(" ");
            
        }
        return sb.toString().trim();
    }
}