package Feb;

import java.util.Arrays;
import java.util.HashMap;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"mumu", "kai", "mine", "mine"};

        String[] answer = solution(players,callings);
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        answer = players;

        //실시간 등수를 Map으로 치환
        HashMap<String, Integer> ranking = new HashMap<>();
        for (int i=0; i<players.length; i++){
            ranking.put(players[i],i);
        }

        for (String callPlayer : callings ) {
            int orgRank = ranking.get(callPlayer);
            if (orgRank>0){
                //선행 주자
                String frontPlayer = answer[orgRank-1];

                //현 주자 선행 주자 자리에 넣기
                ranking.replace(callPlayer,orgRank-1);
                answer[orgRank-1] = callPlayer;

                //선행 주자 현 주자 자리에 넣기
                ranking.replace(frontPlayer,orgRank);
                answer[orgRank] = frontPlayer;
            }
        }

        return answer;
    }
}
