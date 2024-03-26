class Solution {
    public boolean isHappy(int n) {
        // HashSet to store seen numbers to detect cycles
        HashSet<Integer> seen = new HashSet<>();
        
        // Continue the process until n equals 1 (happy) or loop endlessly in a cycle
        while (n != 1) {
            // If the number has been seen before, it's not a happy number
            if (seen.contains(n)) {
                return false;
            }
            // Add the current number to the set
            seen.add(n);
            // Compute the sum of the squares of its digits
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            // Update n with the sum
            n = sum;
        }
        
        // If the loop ends with n equal to 1, it's a happy number
        return true;
    }
}