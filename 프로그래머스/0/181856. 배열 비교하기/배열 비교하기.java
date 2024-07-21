import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
      
        if (arr1.length < arr2.length) {
            return -1;
        } else if (arr1.length > arr2.length) {
            return 1;
        } else {
            // 길이가 같다면 합을 비교
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            
            if (sum1 < sum2) {
                return -1;
            } else if (sum1 > sum2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
