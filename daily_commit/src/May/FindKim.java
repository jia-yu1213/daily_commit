package May;

public class FindKim {

    public static void main(String[] args) {

        String[] seoul = {"Jane", "Kim"};

        //"김서방은 1에 있다"
        String answer = solution(seoul);
        System.out.println("answer = " + answer);
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equalsIgnoreCase(seoul[i])){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
