class Solution {
    
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();

        // my_string을 m 글자씩 나누어 c번째 열의 문자를 추출하여 추가
        // c는 인덱스 맞추기 위해 -1
        for (int i = c - 1; i < my_string.length(); i += m) {
            result.append(my_string.charAt(i));
        }
        
        return result.toString();
    }
}