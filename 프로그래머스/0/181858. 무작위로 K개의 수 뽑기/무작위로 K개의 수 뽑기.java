import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int ar : arr) {
            if (!al.contains(ar))
                al.add(ar);
            if (al.size() == k)
                break;
        }
        
        while (al.size() < k)
            al.add(-1);
             
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}