package Feb;

public class splitChar {

    public static void main(String[] args) {

        String s = "aaabbaccccabba";
        int answer = solution(s);
        System.out.println("answer = " + answer);
    }


    public static int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int same = 0;
        int diff = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==first){
                same += 1;
            } else if (s.charAt(i) != first) {
                diff += 1;
                if (same == diff){
                    answer += 1;
                    if (i+1 >= s.length()){break;}
                    first = s.charAt(i+1);
                    same = 0;
                    diff = 0;
                }
            }
            if (i == s.length()-1 && same != diff){
                answer += 1;
            }
        }
        return answer;
    }
}
