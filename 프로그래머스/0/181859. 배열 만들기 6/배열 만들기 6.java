import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int[] answer = {};
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty())
                stk.add(arr[i]);
            else if (stk.get(stk.size() - 1) == arr[i])
                stk.remove(stk.size() - 1);
            else
                stk.add(arr[i]);                 
        }    
        
        if (stk.isEmpty())
            return new int[]{-1};
        else
            return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}