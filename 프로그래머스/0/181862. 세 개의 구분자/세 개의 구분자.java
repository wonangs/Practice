import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]+"); // [abc]+ 로 a, b, c 순서 상관없이 세문자열이 하나 이상 포함되는 모든 문자열을 기준으로 나눔
        ArrayList<String> ar = new ArrayList<>();
        
        for (String part : parts) { // 구분한 배열에서 공백 제거
            if (!part.isEmpty()) {
                ar.add(part);
            }
        }
        
        if (ar.isEmpty()) {
            return new String[]{"EMPTY"}; // 빈배열 반환
        } else {
            return ar.toArray(new String[ar.size()]); // 공백 제거한 배열 반환
        }
    }
}