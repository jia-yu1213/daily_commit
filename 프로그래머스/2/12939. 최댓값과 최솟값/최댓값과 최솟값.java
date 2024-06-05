class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArray = s.split(" ");
        int max = -9999;
        int min = 9999;
        for (String str : strArray) {
            int strInt = Integer.parseInt(str);
            if (max < strInt) max = strInt;
            if (min > strInt) min = strInt;
        }
       answer = min + " " + max;
        
        return answer;
    }
}