class Solution {


        public int solution(int a, int b) {

            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            int answer = 0;
            int cmp = 0;
            int cmp2 = 0;

            sb.append(a).append(b);
            sb2.append(b).append(a);

            cmp = Integer.parseInt(String.valueOf(sb));
            cmp2 = Integer.parseInt(String.valueOf(sb2));

            if (cmp > cmp2) {
                answer += cmp;
            } else if (cmp < cmp2) {
                answer += cmp2;
            } else {
                answer += cmp;
            }

            return answer;
        }
    }