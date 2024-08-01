class Solution {
    public String solution(String s) {
        String answer = "";

        String[] sSplit = s.split(" ",-1);

        for (int j = 0; j < sSplit.length; j++) {
            for (int i = 0; i < sSplit[j].length(); i++) {
                String n = String.valueOf(sSplit[j].charAt(i));
                if (i % 2 == 0){
                    answer += n.toUpperCase();
                } else {
                    answer += n.toLowerCase();
                }
            }
            if (j != (sSplit.length -1)){
                answer += " ";
            }

        }
        

        return answer;
    }
}