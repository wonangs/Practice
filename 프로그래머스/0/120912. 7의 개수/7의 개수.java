class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int number : array) {
            String numberStr = String.valueOf(number);
            for (char ch : numberStr.toCharArray()) {
                if (ch == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
