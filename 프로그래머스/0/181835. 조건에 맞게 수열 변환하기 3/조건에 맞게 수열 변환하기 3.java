import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i : arr) {
            if (k % 2 != 0)
                al.add(i * k);
            else
                al.add(i + k);
        }
        
        return al.stream().mapToInt(i -> i).toArray();
    }
}