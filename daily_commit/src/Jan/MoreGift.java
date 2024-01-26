package Jan;

import java.util.HashMap;
import java.util.Map;

public class MoreGift {

    public static void main(String[] args) throws Exception {

        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};

        solution(friends,gifts);
    }
    public static int solution(String[] friends, String[] gifts) throws Exception{
        int answer = 0;
        if (!(2 <= friends.length&&friends.length<= 50)){
            throw new Exception("friend length is too long!!");
        }
        if (!(1 <= gifts.length&&gifts.length<= 10000)){
            throw new Exception("gift length is too long!!");
        }

        int[][] giveAndTake = new int[friends.length][friends.length];

        Map<Integer, String> nameToNum = new HashMap<>();
        //이름 배열화
        for (int i = 0; i <= friends.length-1; i++){
            nameToNum.put(i,friends[i]);
        }

        for (String gift : gifts) {
            String giver = gift.split(" ")[0];
            String taker = gift.split(" ")[1];

            for (int i = 0; i <= nameToNum.size()-1; i++){
                if (nameToNum.get(i).equals(giver)){ // 주는 사람 -> 새로행
                    for (int j = 0; j <= nameToNum.size()-1; j++){
                        if (nameToNum.get(j).equals(taker)){ // 받는사람 -> 가로행
                            giveAndTake[i][j] += 1;
                        }
                    }
                }
            }
        }

        int[] takeGift = new int[friends.length];
        for (int i=0; i< giveAndTake.length; i++){
            for (int j=i; j< giveAndTake[i].length; j++){
                if (i==j) continue;
                if (giveAndTake[i][j]>giveAndTake[j][i]){//값이 다른경우 큰 사람에게 포인트
                    takeGift[i] += 1;
                } else if (giveAndTake[i][j]<giveAndTake[j][i]) {
                    takeGift[j] += 1;
                } else if (giveAndTake[i][j]==giveAndTake[j][i]) {
                    int AGive = 0;
                    int ATake = 0;
                    for(int k=0; k < giveAndTake.length; k++){
                        AGive += giveAndTake[i][k];
                    }
                    for(int k=0; k < giveAndTake[i].length; k++){
                        ATake += giveAndTake[k][i];
                    }
                    int APoint = AGive - ATake;

                    int BGive = 0;
                    int BTake = 0;
                    for(int k=0; k < giveAndTake.length; k++){
                        BGive += giveAndTake[j][k];
                    }
                    for(int k=0; k < giveAndTake[i].length; k++){
                        BTake += giveAndTake[k][j];
                    }
                    int BPoint  = BGive - BTake;

                    if (Integer.compare(APoint, BPoint)<0){
                        takeGift[j] += 1;
                    } else if (Integer.compare(APoint, BPoint) > 0) {
                        takeGift[i] += 1;
                    }
                }
            }
        }

        for (int i =0; i<takeGift.length; i++){
            if(answer<takeGift[i]){
                answer = takeGift[i];
            }
        }

        return answer;
    }
}
