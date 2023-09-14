class Solution {
    public int binaryGap(int n) {
        String BinaryStr = Integer.toBinaryString(n);
        int maxDistance = 0;
        int currentDistance = 0;
        boolean foundOne = true;

        for(char digit : BinaryStr.toCharArray()){
            if(digit == '1'){
                if(foundOne){
                    maxDistance = Math.max(maxDistance, currentDistance);
                    currentDistance = 1;

                } else{
                   foundOne = true;
                } 
                }else if(foundOne){
                    currentDistance++;
            }
        }
        return maxDistance;
    }
}