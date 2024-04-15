import java.util.*;
class Solution {
        public ArrayList<Integer> solution(int l, int r) {
            ArrayList<Integer> answer = new ArrayList<>();


            for (int i = l; i <= r; i++) {
                String stri = Integer.toString(i);
                char[] chari = stri.toCharArray();
                int cnt = 0;

                for (int j = 0; j < chari.length; j++) {
                    if (chari[j] == '0' || chari[j] == '5')
                        cnt++;
                }

                if (cnt == chari.length) {
                    answer.add(i);
                }
            }

            if (answer.isEmpty()) {
                answer.add(-1);
            }
            
            return answer;
        }
    }