import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] firstAr = Arrays.copyOfRange(num_list, 0, n);
        int[] secondAr = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] answer = new int[num_list.length];
        
        System.arraycopy(secondAr, 0, answer, 0, secondAr.length);
        System.arraycopy(firstAr, 0, answer, secondAr.length, firstAr.length);
            
        return answer;
    }
}