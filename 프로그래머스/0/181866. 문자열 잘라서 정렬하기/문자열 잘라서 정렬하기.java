import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        return Arrays.stream(myString.split("x", -1)) // x로 분리, 마지막까지 반환  
                     .filter(s -> !s.isEmpty())  // 빈 문자열 제거
                     .sorted()                    // 정렬
                     .toArray(String[]::new);     // 새로운 배열 반환
    }
}