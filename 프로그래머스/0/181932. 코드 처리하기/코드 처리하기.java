class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }

            if (!mode && i % 2 == 0) {
                sb.append(code.charAt(i));
            }
            
            if (mode && i % 2 == 1) {
                sb.append(code.charAt(i));
            }
        }

        answer = sb.toString();
        if (answer.isEmpty()) {
            return "EMPTY";
        } else {
            return answer;
        }
    }
}