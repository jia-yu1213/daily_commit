package Jun;

import java.util.Arrays;

public class MaxMin {
//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
// "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String answer = solution(s);
        System.out.println("answer = " + answer);
    }

    public static String solution(String s) {
        String answer = "";
        String[] strArray = s.split(" ");
        int max = Integer.parseInt(strArray[0]);
        int min = Integer.parseInt(strArray[0]);
        for (String str : strArray) {
            int strInt = Integer.parseInt(str);
            if (max < strInt) max = strInt;
            if (min > strInt) min = strInt;
        }
        answer = min + " " + max;

        return answer;
    }
}
