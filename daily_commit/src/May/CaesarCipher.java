package May;

public class CaesarCipher {

    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n = 25;
        String answer = solution(s, n);
        System.out.println("answer = " + answer);
    }

    public static String solution(String s, int n) {
        String answer = "";

        for (char cha : s.toCharArray()){
            if (" ".equalsIgnoreCase(String.valueOf(cha))){
                answer += " ";
                continue;
            }
            int num = cha;
            if (num > 64 && num < 91){
                num += n;
                if (num > 90) num -= 26;
            } else {
                num += n;
                if (num > 122) num -= 26;
            }

            answer += (char)num;
        }

        return answer;
    }
}
