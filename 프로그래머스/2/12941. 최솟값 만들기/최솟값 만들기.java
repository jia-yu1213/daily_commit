import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
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