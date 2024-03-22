package Mar;

import java.util.Arrays;
import java.util.Stack;

public class BiggerNum {

    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        int[] answer = solution(numbers);
        System.out.println("answer = " + Arrays.toString(answer));
    }
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length-1; i >= 0; i--) {
            while (!stack.isEmpty()){
                if (stack.peek() > numbers[i]){
                    answer[i] = stack.peek();
                    break;
                }else{
                    stack.pop();
                }
            }

            if (stack.isEmpty()){
                answer[i] = -1;
            }

            stack.push(numbers[i]);

        }

        return answer;
    }
}
