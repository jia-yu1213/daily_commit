class Solution {
    public String solution(String polynomial) {
        String answer = "";
                String[] polyArray = polynomial.split(" \\+ ");

        int xNum = 0;
        int num = 0;
        for (String array : polyArray) {
            if (array.contains("x")){
                String xStr = array.substring(0, array.length() - 1);
                if ("".equalsIgnoreCase(xStr)){
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(xStr);
                }
            } else {
                num += Integer.parseInt(array);
            }
        }

        if (xNum > 0 && num > 0){
            answer = (xNum == 1 ? "" : xNum) + "x + " + num;
        } else if (xNum > 0) {
            answer = (xNum == 1 ? "" : xNum) + "x";
        } else {
            answer = String.valueOf(num);
        }
        return answer;
    }
}