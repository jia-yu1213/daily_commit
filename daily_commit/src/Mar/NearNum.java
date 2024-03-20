package Mar;

import java.util.Arrays;
import java.util.HashMap;

public class NearNum {
    public static void main(String[] args) {
        String s = "foobar";

        int[] answer = solution(s);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer>  point = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (point.containsKey(chars[i])){
                answer[i] = (i-point.get(chars[i]));
                point.put(chars[i], i);
            } else {
                point.put(chars[i], i);
                answer[i] = -1;
            }
        }

        return answer;
    }
}
