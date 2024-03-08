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
            if (i < k){
                hof.add(score[i]);
                Collections.sort(hof);
            } else {
                for (int j = hof.size()-1; j >= 0; j--) {
                    if (score[i] > hof.get(j)){
                        for (int l = 0; l < hof.size()-1; l++) {
                            hof.set(l, hof.get(l+1));
                        }
                        hof.set(j,score[i]);
                        break;
                    }
                }
            }
            answer[i] = hof.get(0);
        }
        return answer;
    }
}
