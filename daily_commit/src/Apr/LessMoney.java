package Apr;

public class LessMoney {

    public static void main(String[] args) {
        int price = 1000;
        int money = 10000;
        int count = 2;

        long answer = solution(price, money, count);
        System.out.println("answer = " + answer);
    }
    public static long solution(int price, int money, int count) {
        long answer = -1;

        long fee = 0;
        for (int i = 1; i <= count; i++) {
            fee += price * i;
        }
        answer = fee - money;
        if (answer < 0){
            return 0;
        }

        return answer;
    }
}
