class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        char[] answerarr = new char[999];
        answerarr = my_string.toCharArray();

        for (int i = 0; i < s; i++)
            answer += answerarr[i];

        answer += overwrite_string;

        int lng = s + overwrite_string.length();

        for (int j = lng; j < my_string.length(); j++)
            answer += answerarr[j];

        return answer;
    }
}