class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the min heap
        for (int num : nums) {
            minHeap.offer(num);

            // If the size of the min heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The top element of the min heap is the kth largest element
        return minHeap.peek();
    }
}