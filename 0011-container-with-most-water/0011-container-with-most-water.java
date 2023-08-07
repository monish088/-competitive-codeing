class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int area;
        int maxarea = 0;
        while(start < end){
            area = Math.min(height[start],height[end]) * (end - start);

            if(area > maxarea){
                maxarea = area;
            }
            if( Math.min(height[start],height[end]) == height[start]){
                start++;
            } else {
                end--;
            }
        }

        return maxarea;
    }
}