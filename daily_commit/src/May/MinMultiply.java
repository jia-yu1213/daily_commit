package May;

import java.util.Arrays;

public class MinMultiply {

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        int answer = solution(A, B);
        System.out.println("answer = "+ answer);
    }

    public static int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int i = B.length-1;
        for (int a : A) {
            answer += a * B[i];
            i--;
        }

        return answer;
    }
}
