package Feb;

public class WalkingPark {

    public static void main(String[] args) {
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        int[] answer = solution(park, routes);
        System.out.println("answer = " + answer[0] + " " + answer[1]);
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        String[][] parkMap = new String[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                parkMap[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        int widthPosition = 0;
        int heightPosition = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].indexOf("S")==j){
                    widthPosition = j;
                    heightPosition = i;
                }
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);
            int tempWidth = widthPosition;
            int tempHeight = heightPosition;

            for (int i = 1; i <= move; i++) {
                if (direction.equals("E")){
                    tempWidth += 1;
                } else if (direction.equals("W")) {
                    tempWidth -= 1;
                } else if (direction.equals("S")) {
                    tempHeight += 1;
                } else {
                    tempHeight -= 1;
                }

                if (tempHeight >= 0 && tempHeight < park.length
                        && tempWidth >= 0 && tempWidth < park[0].length()){
                    if (parkMap[tempHeight][tempWidth].equalsIgnoreCase("X")){
                        tempWidth = widthPosition;
                        tempHeight = heightPosition;
                        break;
                    }
                }else{
                    tempWidth = widthPosition;
                    tempHeight = heightPosition;
                    break;
                }

            }

            widthPosition = tempWidth;
            heightPosition = tempHeight;

        }

        answer = new int[]{heightPosition, widthPosition};
        return answer;
    }
}
