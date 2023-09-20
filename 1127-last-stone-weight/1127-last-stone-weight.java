class Solution {
    public int lastStoneWeight(int[] stones) {
         
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        
    
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll(); 
            int stone2 = maxHeap.poll(); 
            
            
            int smashedStone = Math.abs(stone1 - stone2);
            if (smashedStone > 0) {
                maxHeap.offer(smashedStone);
            }
        }
        
        
        if(maxHeap.isEmpty()){
          return 0;
        } else{
          return maxHeap.poll();
        }
    }
}
