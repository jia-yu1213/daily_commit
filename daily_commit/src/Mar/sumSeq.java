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

        int i = 0;
        int j = 0;
        int sum = 0;
        int length = 9999999;
        while (true){
            if (sum == k){
                if (length > (j-i)){
                    length = j - i;
                    answer = new int[]{i,j-1};
                } else if (i == answer[0]) {
                    sum -= sequence[i];
                    i++;
                } else {
                    if (j >= sequence.length) break;
                    sum += sequence[j];
                    j++;
                }
            } else if (sum < k) {
                if (j >= sequence.length) break;
                sum += sequence[j];
                j++;
            } else {
                sum -= sequence[i];
                i++;
            }
        }

        return answer;
    }
}
