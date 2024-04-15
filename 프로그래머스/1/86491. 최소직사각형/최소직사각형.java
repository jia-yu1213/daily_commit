class Solution {
    public int solution(int[][] sizes) {
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