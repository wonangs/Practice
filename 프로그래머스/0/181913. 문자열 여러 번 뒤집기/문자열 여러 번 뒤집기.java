class Solution {
    public String solution(String my_string, int[][] queries) {
        // StringBuilder를 사용하여 문자열을 수정할 수 있게 함
        StringBuilder sb = new StringBuilder(my_string);

        // 각 쿼리마다 처리
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            // 부분 문자열을 추출하고 뒤집기
            String subStr = sb.substring(s, e + 1);
            StringBuilder reversedSubStr = new StringBuilder(subStr).reverse();

            // 뒤집은 문자열을 원래 위치에 배치
            sb.replace(s, e + 1, reversedSubStr.toString());
        }

        // 결과 반환
        return sb.toString();
    }
}