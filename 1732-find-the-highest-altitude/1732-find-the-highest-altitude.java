class Solution {
    public int largestAltitude(int[] gain) {
       int max = 0;
       int currentMax = 0;

       for(int gainValue : gain){
           currentMax += gainValue;
           max = Math.max(max , currentMax);
       }
       return max;
    }
}