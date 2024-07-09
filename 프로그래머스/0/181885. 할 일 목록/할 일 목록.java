import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) { // todo_list를 순회하면서 finished가 없으면 answer에 추가
                answer.add(todo_list[i]);
            }
        }
    
        return answer.toArray(new String[0]);
    }
}
