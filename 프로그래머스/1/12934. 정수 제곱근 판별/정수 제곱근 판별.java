class Solution {
    public long solution(long n) {
        long answer = 0;
        double gn = Math.sqrt(n);
        if (gn % 1 != 0.0){
            answer = -1;
        } else {
            answer = (long) Math.pow(gn + 1, 2);
        }
        return answer;
    }
}