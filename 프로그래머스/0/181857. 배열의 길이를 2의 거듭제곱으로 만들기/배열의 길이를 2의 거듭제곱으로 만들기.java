import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        
        while (size < arr.length) { // 2의 거듭제곱으로 배열 길이 증가
            size *= 2;
        }
        
        return Arrays.copyOf(arr, size);
    }
}
