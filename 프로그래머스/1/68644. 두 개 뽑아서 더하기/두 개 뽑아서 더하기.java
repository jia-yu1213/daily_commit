
import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int[] solution(int[] numbers) {
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