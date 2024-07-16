class Solution {
    public int[] solution(String myString) {
        String[] strSplit = myString.split("x", -1); // split("x", -1)로 마지막 x이후 문자열까지 반환
        int[] answer = new int[strSplit.length];
        
        for (int i = 0; i < strSplit.length; i++) {
            answer[i] = strSplit[i].length();
        }
    
        return answer;
    }
}