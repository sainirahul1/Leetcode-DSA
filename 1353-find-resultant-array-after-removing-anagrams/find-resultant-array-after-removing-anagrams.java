class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result=new ArrayList<>();
        result.add(words[0]);
        for(int i=1;i<words.length;i++){
            String curr=words[i];
            String prev=words[i-1];
            if(isanagram(curr,prev)){
                continue;
            }
            else{
                result.add(curr);
            }
        }

        return result;
        }
    public boolean isanagram(String curr,String prev){
        if(curr.length()!=prev.length()){
            return false;
        }
        curr=curr.toLowerCase();
        prev=prev.toLowerCase();

        char[] arr1=curr.toCharArray();
        char[] arr2=prev.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
    return false;
    }
}