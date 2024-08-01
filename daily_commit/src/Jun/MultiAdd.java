package Jun;

public class MultiAdd {

    //한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    // 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    // 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    // 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    // 같은 식이라면 가장 짧은 수식을 return 합니다.

    //입출력 예
    //polynomial	result
    //"3x + 7 + x"	"4x + 7"
    //"x + x + x"	"3x"

    //입출력 예 #1
    //"3x + 7 + x"에서 동류항끼리 더하면 "4x + 7"입니다.
    //입출력 예 #2
    //"x + x + x"에서 동류항끼리 더하면 "3x"입니다.

    public static void main(String[] args) {
        String polynomial = "x + 1";
        String answer = solution(polynomial);

        System.out.println("answer = " + answer);
    }

    public static String solution(String polynomial) {
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
