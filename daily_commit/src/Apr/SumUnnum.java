package Apr;

import java.util.Arrays;
import java.util.List;

public class SumUnnum {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = solution(numbers);
        System.out.println("answer = " + answer);
    }
    public static int solution(int[] numbers) {
        int answer = -1;

        answer = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }

}
