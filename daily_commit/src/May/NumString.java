package May;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumString {

    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = solution(s);
        System.out.println("answer = " + answer);
    }
    public static int solution(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            s = s.replace(key, String.valueOf(map.get(key)));

        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
