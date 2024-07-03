class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // indices의 인덱스를 null문자로 변경 -> setCharAt 함수는 바로 "" 공백을 입력할 수 없음
        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], '\0');
        }
        // null문자를 공백으로 치환하고 출력
        return sb.toString().replace("\0", "");
    }
}