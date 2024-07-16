import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        return Arrays.stream(myString.split("x")) // x로 분리  
                     .filter(s -> !s.isEmpty())  // 빈 문자열 제거
                     .sorted()                    // 정렬
                     .toArray(String[]::new);     // 새로운 배열 반환
    }
}