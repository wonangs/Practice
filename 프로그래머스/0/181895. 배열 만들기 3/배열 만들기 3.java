import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        // 배열 복사
        int[] ar = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] ar2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
            
        // 각 파트를 합쳐 복사할 새로운 배열
        int[] answer = new int[ar.length + ar2.length];
        
        // ar배열의 0번 인덱스부터 복사해서 answer 배열의 0번 인덱스에 붙여넣기 ar배열의 길이 만큼
        System.arraycopy(ar, 0, answer, 0, ar.length);
        System.arraycopy(ar2, 0, answer, ar.length, ar2.length);

        return answer;
    }
}