class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] calc = binomial.split(" ");
        
        int a = Integer.parseInt(calc[0]);
        char op = calc[1].charAt(0);
        int b = Integer.parseInt(calc[2]);
        
        if (op == '+')
            answer = a + b;
        else if (op == '-')
            answer = a - b;
        else
            answer = a * b;
    
        return answer;
    }
}