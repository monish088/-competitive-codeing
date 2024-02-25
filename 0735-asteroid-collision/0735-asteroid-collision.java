class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // If stack is empty or current asteroid is moving to the right,
            // add it to the stack.
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                // Current asteroid is moving to the left
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    // Explode smaller asteroids moving to the right
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(asteroid)) {
                    // Both asteroids explode if they are the same size
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    // If no asteroids moving to the right remain, or the current asteroid
                    // is larger than the remaining ones moving to the right, add the current
                    // asteroid to the stack
                    stack.push(asteroid);
                }
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}