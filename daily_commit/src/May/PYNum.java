package May;

public class PYNum {

    public static void main(String[] args) {
        String s = "pPoooyY";

        boolean answer = solution(s);
        System.out.println("answer = " + answer);
    }
    static boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;
        String[] array = s.split("");
        for (String each : array) {
            if (each.equalsIgnoreCase("p")||each.equalsIgnoreCase("P")){
                p++;
            } else if (each.equalsIgnoreCase("y")||each.equalsIgnoreCase("Y")) {
                y++;
            }
        }

        if (p!=y) answer = false;

        return answer;
    }
}
