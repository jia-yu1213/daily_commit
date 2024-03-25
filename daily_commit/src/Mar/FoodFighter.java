package Mar;

public class FoodFighter {

    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        String answer = solution(food);

        System.out.println("answer = " + answer);
    }
    public static String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }
        answer = sb + "0";
        answer += sb.reverse();

        return answer;
    }
}
