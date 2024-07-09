import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> ar = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) { // 0번 인덱스부터 5번째 사람마다 추가
            ar.add(names[i]);
        }
        
        String[] answer = new String[ar.size()]; // 리턴할 배열 선언
        answer = ar.toArray(answer); 
        
        return answer;
    }
}
