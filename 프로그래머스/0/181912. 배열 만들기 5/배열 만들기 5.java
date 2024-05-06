import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (String str : intStrs) {
            if (str.length() >= s + l) {
                int num = Integer.parseInt(str.substring(s, s + l));
                if (num > k) {
                    answer.add(num);
                }
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}