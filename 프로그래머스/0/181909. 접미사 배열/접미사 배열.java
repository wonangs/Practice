import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        // 문자열의 길이
        int n = my_string.length();
        
        // 접미사 배열 생성
        String[] ar = new String[n];
        
        for (int i = 0; i < n; i++) {
            // 0부터 n까지 각 인덱스로 시작하는 접미사 생성 substring(i) -> i부터 끝까지 추출
            ar[i] = my_string.substring(i);
        }
        
        // 정렬
        Arrays.sort(ar);
        
        return ar;
    }
}
