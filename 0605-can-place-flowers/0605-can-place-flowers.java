class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int flowersPlanted = 0;
    int i = 0;

    while (i < flowerbed.length) {
        if (flowerbed[i] == 0) {
            // Check if the previous and next plots are also empty or out of bounds.
            boolean prevEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean nextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

            if (prevEmpty && nextEmpty) {
                // Plant a flower in the current plot.
                flowerbed[i] = 1;
                flowersPlanted++;
            }
        }
        i++;
    }

    // Check if enough flowers have been planted.
    return flowersPlanted >= n;
    }
}