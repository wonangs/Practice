class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B"); // 소문자로 바꾼 뒤 해결
        return myString.contains(pat) ? 1 : 0;
    }
}