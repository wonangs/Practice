import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
       for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                // start 인덱스는 한번만 필요
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }
        
        if (start == -1) {
            return new int[]{-1};
        }
        
        // 2를 모두 찾았을 때 배열을 복사하고 반환
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}