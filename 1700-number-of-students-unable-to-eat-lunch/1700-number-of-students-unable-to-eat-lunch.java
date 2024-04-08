class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int student0 = 0, student1 = 0;
        for(int st : students){
            if(st == 1)
                student1++;
            else
                student0++;
        }
        for(int sandwich : sandwiches){
            if(sandwich == 1){
                if(student1 > 0){
                    student1--;
                } else{
                    break;
                }
            }
            if(sandwich == 0){
                if(student0 > 0){
                    student0--;
                } else {
                    break;
                }
            }
        }
        return student0 + student1;
    }
}