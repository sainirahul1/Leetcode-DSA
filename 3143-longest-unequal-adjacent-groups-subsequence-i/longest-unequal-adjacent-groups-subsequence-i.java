class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<Integer> index=new ArrayList<>();
         index.add(0);
         for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[i-1]){
                index.add(i);
            }
         }
         List<String> ans=new ArrayList<>();
         for(int i:index){
            ans.add(words[i]);
         }
         return ans;
    }
}