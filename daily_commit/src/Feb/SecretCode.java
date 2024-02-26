package Feb;

public class SecretCode {

    public static void main(String[] args) {
        String s = "yyyyy";
        String skip = "za";
        int index = 2;
        String answer = solution(s, skip, index);
        System.out.println("answer = " + answer);
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (char x : s.toCharArray()){
            int count = 0;
            while (count != index){
                x += 1;
                if(x > 122) x -= 26;
                if (skip.indexOf(x) >= 0){continue;}
                count += 1;
            }
            answer += x;
        }


        return answer;
    }
}
