class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

    // Check for minimum length
    if (n < 3) {
        return false;
    }

    int i = 0;

    // Traverse the first part (increasing)
    while (i + 1 < n && arr[i] < arr[i + 1]) {
        i++;
    }

    // Check if we reached the peak and there's a decreasing part
    if (i == 0 || i == n - 1) {
        return false; // No peak or single element
    }

    // Traverse the second part (decreasing)
    while (i + 1 < n && arr[i] > arr[i + 1]) {
        i++;
    }

    return i == n - 1; // Check if we reached the end

    }
}