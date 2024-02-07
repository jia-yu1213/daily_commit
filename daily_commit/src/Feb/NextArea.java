package Feb;

public class NextArea {

    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

        int answer = solution(board,h,w);
        System.out.println("answer = " + answer);
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (0 <= h_check && w_check >= 0 && h_check < board.length && w_check < board[0].length
                    && color.equalsIgnoreCase(board[h_check][w_check])){
                answer += 1;
            }
        }

        return answer;
    }
}
