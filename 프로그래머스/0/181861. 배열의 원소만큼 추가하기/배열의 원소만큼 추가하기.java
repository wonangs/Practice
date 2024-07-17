import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
        
        for (int a : arr) {
            for (int j = 0; j < a; j++) { // 이중반복문으로 X에 배열 값 개수 추가
                ar.add(a);
            }
        }
        
        // toArray 메서드를 사용하여 ArrayList를 int[]로 변환
        return ar.stream().mapToInt(Integer::intValue).toArray();
    }
}
