class Solution {
    public int findClosest(int x, int y, int z) {
        int person1=Math.abs(z-x);
        int person2=Math.abs(z-y);
        if(person1==person2){
            return 0;
        }
        int min=Math.min(person1,person2);
        if(min==person1){
            return 1;
        }
            return 2;
    }
}