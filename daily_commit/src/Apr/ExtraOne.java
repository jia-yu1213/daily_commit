package Apr;

public class ExtraOne {

    public static void main(String[] args) {
        int n = 999994;
        int answer = solution(n);
        System.out.println("answer = " + answer);
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < Math.sqrt(n+1); i++) {
            if ((n % i) == 1){
                answer = i;
                break;
            }
        }
        if (answer == 0){
            return n-1 ;
        }
        return answer;
    }
}
