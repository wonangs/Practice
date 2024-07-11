import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] answerAr = Arrays.copyOf(arr, arr.length);
        
        while(true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                }
            }
            
            if (Arrays.equals(arr, answerAr)) {
                break;
            }
            
            answerAr = Arrays.copyOf(arr, arr.length);
            cnt++;
        }
        
        return cnt;
    }
}

