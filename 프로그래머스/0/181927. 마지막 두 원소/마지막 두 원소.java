import java.util.*;
class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
            int last = num_list[num_list.length-1];
            int last2 = num_list[num_list.length-2];

            answer[num_list.length] = (last > last2) ? last - last2 : last * 2;

            return answer;
        }
    }