class Solution {
    public boolean issorted(ArrayList<Integer>arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int n=nums.length;
       ArrayList<Integer> arr=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
          arr.add(nums[i]);
      }
       int count=0;
       while(!issorted(arr)){
        int min=Integer.MAX_VALUE;
        int minindex=-1;
        for(int i=1;i<arr.size();i++){
            int sum=arr.get(i-1)+arr.get(i);
             if(sum<min){
                min=sum;
                minindex=i-1;
             }
        }
        arr.set(minindex,min);
             arr.remove(minindex+1);
            count++;
    }
    return count;

    }
}