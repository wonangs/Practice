class Solution {
    public int solution(String[] strArr) {
        // 1부터 30까지 길이별 수 저장할 배열
        int[] cnt = new int[31];

        // 각 문자열의 길이에 따라 배열의 값을 증가
        for (String str : strArr) {
            int length = str.length();
            cnt[length]++;
        }

        // 최대값 찾기(메서드 사용)
        int max = 0;
        for (int count : cnt) {
            max = Math.max(max, count);
        }

        return max;
    }
}
