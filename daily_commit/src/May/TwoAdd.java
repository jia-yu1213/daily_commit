package May;

import java.util.Arrays;
import java.util.HashSet;


public class TwoAdd {

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] answer = solution(numbers);
        for (int num : answer) {
            System.out.println(num);
        }
    }
    public static int[] solution(int[] numbers) {
        HashSet<Integer> numAdd = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j){
                    numAdd.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer = new int[numAdd.size()];
        int index = 0;
        for (Integer addNum : numAdd) {
            answer[index] = addNum;
            index++;
        }
        Arrays.sort(answer);

        return answer;
    }
}
