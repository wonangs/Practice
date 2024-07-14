class Solution {
    public String solution(String my_string, String alp) {
        
        String upalp = alp.toUpperCase();
        
        String answer = my_string.replace(alp, upalp);
        
        return answer;
    }
}