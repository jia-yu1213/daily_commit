package May;

public class MathSqrt {

    public static void main(String[] args) {
        long n = 121;
        long answer = solution(n);
        System.out.println("answer = " + answer);
    }

    public static long solution(long n) {
        long answer = 0;

        double gn = Math.sqrt(n);
        if (gn % 1 != 0.0){
            answer = -1;
        } else {
            answer = (long) Math.pow(gn + 1, 2);
        }

        return answer;
    }
}
