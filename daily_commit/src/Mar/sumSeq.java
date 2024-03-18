package Mar;

import java.util.Arrays;
import java.util.HashMap;

public class sumSeq {

    public static void main(String[] args) {
        int[] sequence = {2, 2, 2, 2, 2};
        int k = 6;

        int[] answer = solution(sequence, k);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = {0 , 0};

        
        for (int i = 0; i < sequence.length; i++) {
            int sum = 0;
            for (int j = i; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum == k){
                    if ((answer[1] == 0) ||
                       ((j - i) < (answer[1] - answer[0])) ||
                       (((j - i) == (answer[1] - answer[0])) && i < answer[0])){
                        answer = new int[]{i, j};
                    }
                }
                if (sum > k){
                    break;
                }
            }
        }

        return answer;
    }
}
