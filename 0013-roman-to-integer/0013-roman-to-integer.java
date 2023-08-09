class Solution {
    public int romanToInt(String s) {
            // Create a HashMap to store Roman numeral symbols and their corresponding values
        HashMap<Character, Integer> symbolToValue = new HashMap<>();
        symbolToValue.put('I', 1);
        symbolToValue.put('V', 5);
        symbolToValue.put('X', 10);
        symbolToValue.put('L', 50);
        symbolToValue.put('C', 100);
        symbolToValue.put('D', 500);
        symbolToValue.put('M', 1000);

        int result = 0;
        int prevValue = 0;
         for (int i = s.length() - 1; i >= 0; i--) {
            char symbol = s.charAt(i);
            int value = symbolToValue.get(symbol);

// If the current value is smaller than the previous value, subtract it; otherwise, add it
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            // Update the previous value for the next iteration
            prevValue = value;
        }

        return result;
    }
}