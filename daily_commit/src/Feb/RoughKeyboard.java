package Feb;

import java.util.Arrays;
import java.util.HashMap;

public class RoughKeyboard {
    public static void main(String[] args) {
        String[] keymap = {"ABCE"};
        String[] targets = {"ABDE"};
        int[] answer = solution(keymap, targets);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int j = 0; j < targets.length; j++) {
            int targetAnswer = 0;
            for (int i = 0; i < targets[j].length(); i++) {
                int temp = 0;
                for (int k = 0; k < keymap.length; k++) {
                    int keyTemp = keymap[k].indexOf(targets[j].charAt(i));
                    if (k==0){
                        temp = keyTemp;
                    } else if (keyTemp >= 0 && (keyTemp < temp || temp < 0)) {
                        temp = keyTemp;
                    }
                }
                if (temp >= 0) {
                    targetAnswer += temp+1;
                } else {
                    targetAnswer = temp;
                    break;
                }

            }

            answer[j] = targetAnswer;
        }

        return answer;
    }

}
