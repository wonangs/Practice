class Solution {
    public int solution(String myString, String pat) {
        String lw_myString = myString.toLowerCase();
        String lw_pat = pat.toLowerCase();
        
        return lw_myString.contains(lw_pat) ? 1 : 0;
    }
}
