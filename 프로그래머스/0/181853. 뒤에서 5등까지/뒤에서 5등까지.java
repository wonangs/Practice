import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
       
        Arrays.sort(num_list);
        int[] five = new int[5];
        
        for (int i = 0; i < 5; i++)
            five[i] = num_list[i];
        
        return five;
    }
}