class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> hm = new HashMap<>();

        for(String str : arr){
            hm.put(str, hm.getOrDefault(str, 0)+ 1);
        }
        int count = 0;
        for(String str : arr){
            if(hm.get(str) == 1){
                count++;
            }
            if(count == k){
                return str;
            }
        }
        return "";
    }
}