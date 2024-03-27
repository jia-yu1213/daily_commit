package Mar;

public class Babbling2 {

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        int answer = solution(babbling);
        System.out.println("answer = " + answer);
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] can = {"aya", "ye", "woo", "ma"};
        for (String word : babbling) {
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) continue;
            for (String canWord : can) {
                word = word.replace(canWord , " ");
            }
            word = word.replaceAll(" ", "");
            if (word.length() == 0) answer++;
        }
        return answer;
    }
}
