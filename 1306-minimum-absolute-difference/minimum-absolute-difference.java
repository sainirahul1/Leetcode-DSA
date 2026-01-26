class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<>();
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
             if(diff<mindiff){
             mindiff=diff;
             }     
        }
        for(int i=1;i<arr.length;i++){
             ArrayList<Integer> nums=new ArrayList<>();
            if(Math.abs(arr[i-1]-arr[i])==mindiff){
                nums.add(arr[i-1]);
                nums.add(arr[i]);
            result.add(nums);
            }
        }
        return result;
    }
}