package Mar;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeHamburger {

    public static void main(String[] args) {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int answer = solution(ingredient);
        System.out.println("answer = " + answer);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        ArrayList<Integer> stack = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
            if (stack.size()>=4
                && stack.get(stack.size()-4)==1
                && stack.get(stack.size()-3)==2
                && stack.get(stack.size()-2)==3
                && stack.get(stack.size()-1)==1){
                answer++;
                for (int j = 0; j < 4; j++) {
                    stack.remove(stack.size()-1);
                }
            }
        }

        return answer;
    }
}
