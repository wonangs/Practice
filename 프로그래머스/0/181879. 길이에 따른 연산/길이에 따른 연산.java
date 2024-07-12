class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11) {
            for(int sum : num_list)
                answer += sum;
        } else {
            answer = 1;
            for(int mul : num_list)
                answer *= mul;
        }
        return answer;
    }
}