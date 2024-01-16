class RandomizedSet {
 private ArrayList<Integer> nums;
    private HashMap<Integer, Integer> indexMap;
    private Random rand;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        nums = new ArrayList<>();
        indexMap = new HashMap<>();
        rand = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (indexMap.containsKey(val)) {
            return false;
        }

        nums.add(val);
        indexMap.put(val, nums.size() - 1);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        int index = indexMap.get(val);
        int lastElement = nums.get(nums.size() - 1);

        nums.set(index, lastElement);
        indexMap.put(lastElement, index);

        nums.remove(nums.size() - 1);
        indexMap.remove(val);

        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int randomIndex = rand.nextInt(nums.size());
        return nums.get(randomIndex);
}
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */