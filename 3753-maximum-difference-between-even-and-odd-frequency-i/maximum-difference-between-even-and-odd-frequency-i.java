class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        int evencount=Integer.MAX_VALUE;
        int oddcount=Integer.MIN_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }

        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0){
                evencount=Math.min(evencount,entry.getValue());
            }
            else if(entry.getValue()%2!=0){
                oddcount=Math.max(oddcount,entry.getValue());
            }
        }
        return oddcount-evencount;
    }
}