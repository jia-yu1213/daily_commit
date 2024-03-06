package Mar;

public class KnightWpn {

    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;

        int answer = solution(number, limit, power);
        System.out.println("answer = " + answer);

    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }

            if (count > limit){
                count = power;
            }
            answer += count;
        }

        return answer;
    }

}
