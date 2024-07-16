import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().replaceAll(" +", " ").split(" "); // replaceAll(" +", " ") " +"는 정규식
        return answer;
    }
}