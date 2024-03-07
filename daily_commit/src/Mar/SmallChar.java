package Mar;

public class SmallChar {

    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";

        int answer = solution(t, p);
        System.out.println("answer = " + answer);
    }

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length()-p.length()+1; i++) {
            if (Long.parseLong(t.substring(i,i+p.length())) <= Long.parseLong(p)) answer += 1;
        }

        return answer;
    }
}
