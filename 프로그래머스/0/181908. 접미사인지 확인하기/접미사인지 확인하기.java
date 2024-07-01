
import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int n = my_string.length();
        
        String[] ar = new String[n];
        
        for (int i = 0; i < n; i++) {
            // 0부터 n까지 각 인덱스로 시작하는 접미사 생성 substring(i) -> i부터 끝까지 추출
            ar[i] = my_string.substring(i);
        }
        
        for (int i = 0; i < n; i++) {
            // 배열을 돌며 단어가 일치하는지 확인
            if (ar[i].equals(is_suffix))
                return 1;
        }
        
        return 0;
    }
}