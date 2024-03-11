package Mar;

import java.util.Arrays;

public class FruitSeller {

    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        
        int answer = solution(k, m, score);
        System.out.println("answer = " + answer);
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= 0; i -= m) {
            if ((i-m) < 0) break;
            answer += score[i-m] * m;
        }
        
        return answer;
    }
}
