package May;

public class weirdWord {

    public static void main(String[] args) {
        String s = "  TRy HElLo  WORLD ";

        String answer = solution(s);
        System.out.println("answer = /" + answer + "/");
    }

    //각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
    public static String solution(String s) {
        String answer = "";

        String[] sSplit = s.split(" ", -1);

        for (int j = 0; j < sSplit.length; j++) {
            for (int i = 0; i < sSplit[j].length(); i++) {
                String n = String.valueOf(sSplit[j].charAt(i));
                if (i % 2 == 0){
                    answer += n.toUpperCase();
                } else {
                    answer += n.toLowerCase();
                }
            }
            if (j != (sSplit.length -1)){
                answer += " ";
            }

        }


        return answer;
    }
}
