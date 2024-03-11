package Mar;

import java.util.*;

public class HOF {

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = solution(k, score);

        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> hof = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            hof.add(score[i]);
            if (hof.size() > k){
                hof.remove(Collections.min(hof));
            }
            answer[i] = Collections.min(hof);
        }
        return answer;
    }
}
