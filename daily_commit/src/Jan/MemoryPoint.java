package Jan;

import java.util.Arrays;
import java.util.HashMap;

public class MemoryPoint {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
        int[] answer = solution(name,yearning,photo);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> point = new HashMap<String, Integer>();
        for (int i = 0; i < name.length; i++) {
            point.put(name[i],yearning[i]);
        }

        for (int j = 0; j < photo.length; j++) {
            for (int i = 0; i < photo[j].length; i++) {
                if (point.containsKey(photo[j][i])){
                    answer[j] += point.get(photo[j][i]);
                }
            }
        }

        return answer;
    }
}
