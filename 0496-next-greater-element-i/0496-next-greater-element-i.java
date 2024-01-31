class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();

        Map<Integer, Integer> nextGreaterMap = new HashMap<>();

        for(int i = nums2.length - 1; i >= 0; i--){
            int element = nums2[i];

            while(!st.isEmpty() && st.peek() <= element){
                st.pop();
            }

            if(st.isEmpty()){
                nextGreaterMap.put(element, -1);
            } else{
                nextGreaterMap.put(element, st.peek());
            }
            st.push(element);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        return result;
        
    }
}