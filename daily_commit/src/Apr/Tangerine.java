package Apr;

import java.util.*;

public class Tangerine {

    public static void main(String[] args) {
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};

        int answer = solution(k, tangerine);
        System.out.println("answer = " + answer);
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> tanNum = new HashMap<>();

        for (int tan : tangerine) {
            if (tanNum.containsKey(tan)){
                tanNum.put(tan, (tanNum.get(tan) + 1));
            } else {
                tanNum.put(tan, 1);
            }
        }

        List<Integer> keys = new ArrayList<>(tanNum.keySet()); // ["sangsangss1", "sangsangss2", ...]
        Collections.sort(keys, (v1, v2) -> (tanNum.get(v2).compareTo(tanNum.get(v1))));

        int boxTan = 0;
        for (int key : keys) {
            boxTan += tanNum.get(key);
            answer += 1;
            if (boxTan >= k) break;
        }

        return answer;
    }
}
