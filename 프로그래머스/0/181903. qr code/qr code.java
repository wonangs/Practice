class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        // code 길이만큼 반복하면서 인덱스를 q로 나눈 나머지 r에 해당하는 문자를 추가
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r)
                sb.append(code.charAt(i));
        }
        
        return sb.toString();
    }
}