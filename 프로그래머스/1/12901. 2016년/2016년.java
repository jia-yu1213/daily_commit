class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int num = 0;
        if (a != 1){
            for (int i = 1; i < a; i++) {
                if (i == 2){
                    num += 29;
                 } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    num += 31;
                } else {
                    num += 30;
                }
            }
        }
        num += b-1;

        if (num % 7 == 0){
            answer = "FRI";
        } else if (num % 7 == 1) {
            answer = "SAT";
        } else if (num % 7 == 2) {
            answer = "SUN";
        } else if (num % 7 == 3) {
            answer = "MON";
        } else if (num % 7 == 4) {
            answer = "TUE";
        } else if (num % 7 == 5) {
            answer = "WED";
        } else {
            answer = "THU";
        }
        return answer;
    }
}