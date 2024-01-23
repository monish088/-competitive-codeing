class Solution {
    public int maxLength(List<String> arr) {
        // List<Integer> dp = new ArrayList<>();
        // dp.add(0);
        // int res = 0;
        // for (String s : arr) {
        //     int a = 0, dup = 0;
        //     for (char c : s.toCharArray()) {
        //         dup |= a & (1 << (c - 'a'));
        //         a |= 1 << (c - 'a');
        //     }
        //     if (dup > 0)
        //         continue;
        //     for (int i = dp.size() - 1; i >= 0; i--) {
        //         if ((dp.get(i) & a) > 0)
        //             continue;
        //         dp.add(dp.get(i) | a);
        //         res = Math.max(res, Integer.bitCount(dp.get(i) | a));
        //     }

        // }
        // return res;

        String temp = "";

        int n = arr.size();
        int i = 0;
        return solve(i,arr,temp,n);
    }

    public int solve(int i,List<String> arr, String temp, int n){
        if(i >= n){
            return temp.length();
        }
        int include = 0;
        int exclude = 0;

        if(hasDuplicate(temp,arr.get(i))){
            exclude = solve(i+1, arr,temp,n);
        } else{
            exclude = solve(i+1,arr,temp,n);

            include = solve(i+1,arr,temp+arr.get(i),n);
        }
        return Math.max(include,exclude);
    }
    private boolean hasDuplicate(String s1, String s2){
        int[] arr = new int[26];

        for(char ch : s1.toCharArray()){
            if(arr[ch - 'a']>0){
                return true;
            }
            arr[ch - 'a']++;
        }
        for (char ch : s2.toCharArray()) {
            if (arr[ch - 'a'] > 0) {
                return true;
            }
        }

        return false;
    }
}