class Solution {
    public int[] solution(String my_string) {
        int[] ar = new int[52];

        // 문자열을 순회하면서 각 문자의 개수를 증가
        for (char ch : my_string.toCharArray()) {
            // 아스키 코드 사용으로 작은 따옴표 사용
            if (ch >= 'A' && ch <= 'Z') {
                // 0~25 인덱스
                ar[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {         
                // 26~52 인덱스
                ar[ch - 'a' + 26]++;
            }
        }

        return ar;
    }
}
