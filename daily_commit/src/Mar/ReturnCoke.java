package Mar;

public class ReturnCoke {

    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int n = 20;

        int answer = solution(a, b, n);
        System.out.println("answer = " + answer);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int remain = n;
        while (remain >= a){
            int returnCoke = (remain / a) * b;
            answer += returnCoke;
            remain = returnCoke + (remain % a);
        }
        return answer;
    }
}
