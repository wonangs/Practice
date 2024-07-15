import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> al = new ArrayList<>();    
        
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) // "ad"를 포함하지 않는다면 al에 추가
                al.add(strArr[i]);
        }
        
        return al.toArray(new String[0]); // new String[0] 으로 최소 크기 0, 이보다 더 큰 내용이 들어오면 자동으로 증가한 후 출력
    }
}