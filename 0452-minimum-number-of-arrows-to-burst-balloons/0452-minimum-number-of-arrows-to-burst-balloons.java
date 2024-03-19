class Solution {
    public int findMinArrowShots(int[][] points) {
         if (points == null || points.length == 0) return 0;
        
        // Sort balloons by their start points
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        
        int arrows = 1;
        int prevEnd = points[0][1];
        
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > prevEnd) {
                // Need to shoot another arrow
                arrows++;
                prevEnd = points[i][1];
            } else {
                // Update the previous end point to the minimum of current and previous end points
                prevEnd = Math.min(prevEnd, points[i][1]);
            }
        }
        
        return arrows;
    }
}