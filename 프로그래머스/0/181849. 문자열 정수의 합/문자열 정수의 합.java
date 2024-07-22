class Solution {
    public int solution(String num_str) {
        String[] answer = {};
        int sum = 0;
        answer = num_str.split("");
        
        for (String num : answer) {
            sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}