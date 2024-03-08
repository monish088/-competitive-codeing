class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for(int freq : mp.values()){
            maxFreq = Math.max(maxFreq, freq);
        }

        for(int freq : mp.values()){
            if(freq == maxFreq){
                count += maxFreq;
            }
        }
        return count;
    }
}