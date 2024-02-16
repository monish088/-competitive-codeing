class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
         Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each integer in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a list of frequencies and sort it
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencies);
        
        int uniqueIntegers = frequencyMap.size();
        
        // Remove elements with lowest frequencies until k becomes 0 or there are no more elements
        for (int frequency : frequencies) {
            if (k >= frequency) {
                k -= frequency;
                uniqueIntegers--;
            } else {
                break;
            }
        }
        
        return uniqueIntegers;
    }
}