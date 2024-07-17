class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
       for (char ch : myString.toCharArray()) { // sb를 charArray로 하나씩 읽음
            if (ch == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }
        
        if (sb.toString().contains(pat))
            return 1;
        else
            return 0;
    }
}