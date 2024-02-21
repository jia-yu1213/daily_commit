package Feb;

import java.util.Arrays;

public class WordCard {

    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String answer = solution(cards1, cards2, goal);
        System.out.println("answer = " + answer);
    }
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        for (String word: goal) {
            if (cards1.length != 0 && cards1[0].equalsIgnoreCase(word)){
                cards1 = Arrays.copyOfRange(cards1, 1, cards1.length);
                answer = "Yes";
            } else if (cards2.length != 0 && cards2[0].equalsIgnoreCase(word)) {
                cards2 = Arrays.copyOfRange(cards2, 1, cards2.length);
                answer = "Yes";
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
