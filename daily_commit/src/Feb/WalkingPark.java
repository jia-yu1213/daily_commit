package Feb;

public class WalkingPark {

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        solution(park, routes);
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

            if (direction.equals("E")){
                tempWidth += move;
            } else if (direction.equals("W")) {
                tempWidth -= move;
            } else if (direction.equals("S")) {
                tempHeight += move;
            } else {
                tempHeight -= move;
            }

            if (tempHeight >= 0 && tempHeight < park.length
            && tempWidth >= 0 && tempWidth < park[0].length()){
                widthPosition = tempWidth;
                heightPosition = tempHeight;
            }

        }


        return answer;
    }
}
