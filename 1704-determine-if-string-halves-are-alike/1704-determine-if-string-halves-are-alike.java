class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int halfLength = length/2;

        String a = s.substring(0, halfLength);
        String b = s.substring(halfLength);

        int countA = countVowels(a);
        int countB = countVowels(b);
        
        return countA == countB;
    }
    private int countVowels(String str){
        str = str.toLowerCase();
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'i' || ch == 'o' || ch =='u'|| ch == 'e'){
                count++;
            }
        }
        return count;
    }
}