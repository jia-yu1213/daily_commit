import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
         int[] countX = new int[10];
        int[] countY = new int[10];

        for (char x : X.toCharArray()) {
            countX[x-'0']++;
        }
        for (char y : Y.toCharArray()) {
            countY[y-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (countX[i] > 0 && countY[i] > 0){
                sb.append(i);
                countX[i]--;
                countY[i]--;
            }
        }

        answer = sb.toString();
        if ("".equalsIgnoreCase(answer)) return "-1";
        if ("0".equalsIgnoreCase(answer.substring(0,1))) return "0";
        return answer;
    }
}