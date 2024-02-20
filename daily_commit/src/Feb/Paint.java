package Feb;

public class Paint {

    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        int[] section = {1, 2,3,4};
        int answer = solution(n, m, section);
        System.out.println("answer = " + answer);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = 0;
        int end = 0;
        for (int i = 0; i < section.length; i++) {
            if (end >= section[i]) continue;
            start = section[i];
            end = start + m - 1;
            answer += 1;
        }

        return answer;
    }
}
