class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int size = 1;
        
        while (size < length) { // 2의 거듭제곱으로 배열 길이 증가
            size *= 2;
        }
        
        int[] answer = new int[size]; // 기본값 0으로 채워져 있음
        System.arraycopy(arr, 0, answer, 0, length); // arr 배열을 0부터 복사, answer에 0부터 붙여넣음, length길이 만큼 나머지는 기본값 0
        
        return answer;
    }
}
