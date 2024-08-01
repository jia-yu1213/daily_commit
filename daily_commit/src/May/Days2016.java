package May;

public class Days2016 {

    //2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
    // 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    // 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
    // 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
    //5	24	"TUE"

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        String answer = solution(a, b);
        System.out.println("answer = " + answer);
    }
    public static String solution(int a, int b) {
        String answer = "";
        int num = 0;
        if (a != 1){
            for (int i = 1; i < a; i++) {
                if (i == 2){
                    num += 29;
                } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    num += 31;
                } else {
                    num += 30;
                }
            }
        }
        num += b-1;

        if (num % 7 == 0){
            answer = "FRI";
        } else if (num % 7 == 1) {
            answer = "SAT";
        } else if (num % 7 == 2) {
            answer = "SUN";
        } else if (num % 7 == 3) {
            answer = "MON";
        } else if (num % 7 == 4) {
            answer = "TUE";
        } else if (num % 7 == 5) {
            answer = "WED";
        } else {
            answer = "THU";
        }


        return answer;
    }
}
