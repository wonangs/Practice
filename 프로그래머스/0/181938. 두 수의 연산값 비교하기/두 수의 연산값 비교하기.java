class Solution {
    public int solution(int a, int b) {
        int answer = 0;

            int aLong = Integer.parseInt("" + a + b);
            int bLong = 2 * a * b;

            answer = aLong > bLong ? aLong : bLong;

            return answer;
    }
}