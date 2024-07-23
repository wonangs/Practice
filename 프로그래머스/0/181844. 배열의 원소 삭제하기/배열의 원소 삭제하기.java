import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> al = new ArrayList<>();
        
        // 배열을 arraylist에 추가
        for (int farr : arr) { 
            al.add(farr);
        }
        
        // delete_list를 돌며 해당하는 숫자를 arraylist에서 삭제
        for (int num : delete_list) {
            al.remove(Integer.valueOf(num));
        }
        
        
        // arraylist to array
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}