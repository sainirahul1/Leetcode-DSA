class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int fullbottles=numBottles;
        int emptybottles=numBottles;
        while(emptybottles>=numExchange){
            emptybottles=emptybottles-numExchange;
            fullbottles+=1;
            emptybottles+=1;
            numExchange+=1;
        }
  return fullbottles;
    }
}