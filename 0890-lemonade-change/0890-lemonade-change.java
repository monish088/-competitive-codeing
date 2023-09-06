class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change_5 = 0;
        int change_10 = 0;

        for(int bill : bills){
            if(bill == 5){
                change_5++;
            } else if(bill == 10){
                if(change_5 > 0){
                    change_5--;
                    change_10++;
                } else {
                    return false;
                }
            } else if(bill == 20){
                if(change_5 > 0 && change_10 > 0){
                    change_5--;
                    change_10--;
                } else if(change_5 >= 3){
                    change_5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}