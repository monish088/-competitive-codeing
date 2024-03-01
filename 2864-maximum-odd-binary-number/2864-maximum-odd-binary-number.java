class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;

        for(char c : s.toCharArray()){
            if(c == '1'){
                count1++;
            }else{
                count0++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < count1 - 1; i++){
            sb.append("1");
        }
        for(int i = 0; i < count0; i++){
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}