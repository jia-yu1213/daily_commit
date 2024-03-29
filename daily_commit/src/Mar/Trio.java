package Mar;

public class Trio {

    public static void main(String[] args) {
        int[] number = {-1, 1, -1, 1};

        int answer = solution(number);
        System.out.println("answer = " + answer);
    }
    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length-2; i++) {
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    int num = number[i]+number[j]+number[k];
                    if (num == 0) answer++;
                }
            }
        }

        return answer;
    }
}
