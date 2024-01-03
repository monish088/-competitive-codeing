class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // String nS = arr1.toString();
        // String nT = arr1.toString();

        // if(nS.equals(nT)){
        //     return true;
        // } else{
        //     return false;
        // }
        return Arrays.equals(arr1,arr2);
    }
}