import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        // String을 ArrayList<Character>로 변환
        ArrayList<Character> charList = new ArrayList<>(my_string.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList()));
        
        // queries를 stream으로 처리
        Arrays.stream(queries).forEach(query -> {
            int start = query[0];
            int end = query[1];
            
            // 부분 리스트를 뒤집기
            Collections.reverse(charList.subList(start, end + 1));
        });
        
        // ArrayList<Character>를 다시 String으로 변환
        String answer = charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        
        return answer;
    }
}