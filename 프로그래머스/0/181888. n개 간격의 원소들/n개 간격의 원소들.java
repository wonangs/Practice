import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        
        // n 간격으로 요소 추가
        for (int i = 0; i < num_list.length; i += n) {
            al.add(num_list[i]);
        }
        
        return al;
    }
}
