class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
                for (char cha : s.toCharArray()){
            if (" ".equalsIgnoreCase(String.valueOf(cha))){
                answer += " ";
                continue;
            }
            int num = cha;
            if (num > 64 && num < 91){
                num += n;
                if (num > 90) num -= 26;
            } else {
                num += n;
                if (num > 122) num -= 26;
            }
            
            answer += (char)num;
        }
        
        return answer;
    }
}