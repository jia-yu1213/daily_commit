package Apr;

public class BCWallet {

    public static void main(String[] args) {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int answer = solution(sizes);
        System.out.println("answer = " + answer);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        int[] walletSize = {0, 0};
        for (int[] size : sizes) {
            int big = Math.max(size[0], size[1]);
            int small = Math.min(size[0], size[1]);

            walletSize[0] = (small > walletSize[0]) ? small : walletSize[0];
            walletSize[1] = (big > walletSize[1]) ? big : walletSize[1];
        }

        answer = walletSize[0] * walletSize[1];

        return answer;
    }


}
