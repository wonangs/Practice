class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            result.append(c < 'l' ? 'l' : c);
        }
        
        return result.toString();
    }
}
