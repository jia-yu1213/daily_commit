package Feb;

public class SecretCode {

    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = solution(s, skip, index);
        System.out.println("answer = " + answer);
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (char x : s.toCharArray()){
            int count = 0;
            while (count!=index){
                x += 1;
                if (skip.indexOf(x) > 0){continue;}
                count += 1;
            }
            answer += x;
        }


        return answer;
    }
}
